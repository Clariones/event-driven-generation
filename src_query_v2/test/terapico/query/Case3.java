package test.terapico.query;

import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.saleschain.gen.dbquery.DemandProposalStatus;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Case3 {
    // 模型文件存放的目录, 指向 modeling 目录所在的文件夹
    public static String INPUT_MODEL_FOLDER = "/works/jobs/saleschain_v1/workspace/web-code-generator/sky";
    // 生成的模型文件存放的目录, 指向 modeling 目录所在的文件夹. 通常指向和 INPUT_MODEL_FOLDER 相同的位置
    public static String OUTPUT_MODEL_FOLDER = INPUT_MODEL_FOLDER;
    // 生成的 java 代码存放的目录, 指向目标工程中的一个 '源代码目录'. 通常指向 bizcore/WEB-INF/ 这样的目录
    public static String OUTPUT_JAVA_FOLDER = "/works/jobs/saleschain_v1/workspace/saleschain-biz-suite/bizcore/WEB-INF"; // /optical_client_src";
    // 生成的 page_flow 相关java源代码的(项目中)根目录, 通常指向 OUTPUT_JAVA_FOLDER 下的 xxx_custom_src. 因为项目迭代的关系,也可能需要额外指定目录
    public static String OUTPUT_PAGEFLOW_FOLDER_NAME = "saleschain_client_src";
    // 生成目标项目的 项目名, 通常与模型文件的项目名一致
    public static String TARGET_PROJECT_NAME = "saleschain";
    // 生成目标项目的 组织名, 通常与模型文件的组织名一致
    public static String TARGET_ORGANIZATION_NAME = "doublechaintech";
    // 生成的项目的基本包名, 通常是 com.<TARGET_ORGANIZATION_NAME>.<TARGET_PROJECT_NAME>
    public static String TARGET_BASE_PACKAGE_NAME = "com." + TARGET_ORGANIZATION_NAME +"." + TARGET_PROJECT_NAME;
    // 生成page_flow代码时,基类的完整类名
    public static String TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME = "com.doublechaintech.saleschain.wxappclient.WxappCustomService";
    // 生成page_flow代码时,目标的bean名字, 通常就是 TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME 原来的bean 名字
    public static String TARGET_PAGEFLOW_JAVA_BEAN_NAME = "wxappService";
    protected static String getClassName(String fullClassName) {
        int pos = fullClassName.lastIndexOf(".");
        return pos > 0 ? fullClassName.substring(pos+1) : fullClassName;
    }

    protected static String getPackageName(String fullClassName) {
        int pos = fullClassName.lastIndexOf(".");
        return pos > 0 ? fullClassName.substring(0,pos) : fullClassName;
    }

    public void run() throws Exception {
        PageFlowScript script = new PageFlowScript();
        script.setName("test");
        script
                .base_on()
                .base_package_name(TARGET_BASE_PACKAGE_NAME)
                .project_name(TARGET_PROJECT_NAME)
                .parent_class_name(getClassName(TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME))
                .parent_class_package(getPackageName(TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME))
                .bean_name(TARGET_PAGEFLOW_JAVA_BEAN_NAME)
                .addTag("change_request", "true")
                .request_homepage().got_home_page();
        makeSequel(script);

        PageFlowGenerator generator = new PageFlowGenerator();
        generator.setBaseOutputFolder("./output");
        generator.setBaseTempalteFolder("./template");
        generator.generateWithScript(script);
    }

    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.demand()).list_of("post by user").pagination().with_string("user id").with_string("status")
                .comments("查询用户提交的 需求 ")
                .do_it_as()
                .where(MODEL.demand().submitter().eq("${user id}"),
                        MODEL.demand().demandStatus().code().eq("${status}"))
                .wants(MODEL.demand().demandType())

                .query(MODEL.demand()).list_of("check by user").pagination().with_string("mobile").with_string("status")
                .comments("查询需要用户处理的 需求")
                .do_it_as()
                .where(MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile}"),
                        MODEL.demand().demandStatus().code().eq("${status}"))

                .query(MODEL.demand()).list_of("related to user").pagination().with_string("mobile").with_string("status")
                .comments("查询用户相关的 需求, 既包括他提交的,也包括需要他处理的")
                .do_it_as()
                .where(
                        MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile}")
                                .or(MODEL.demand().submitter().mobile().eq("${mobile}")),
                        MODEL.demand().demandStatus().code().eq("${status}"))

                .find(MODEL.demand()).which("post by user").with_string("user id")
                .comments("统计各种状态下 需求 的数量")
                .do_it_as().count_by(MODEL.demand().demandStatus())
                .where(MODEL.demand().submitter().eq("${user id}"))

                .find(MODEL.demand()).which("check by user").with_string("mobile")
                .comments("统计各种状态下需要被我处理的 需求 的数量")
                .do_it_as().count_by(MODEL.demand().demandStatus())
                .where(MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile}"))

                .query(MODEL.demandProposal()).list_of("post by user").with_string("demand id")
                .comments("查询用户提交的 需求 下的所有 demand-proposal")
                .do_it_as()
                .where(MODEL.demandProposal().demand().eq("${demand id}"))
                .wants(MODEL.demandProposal().userStatus(),
                        MODEL.demandProposal().demandProposalTradeList(),
                        MODEL.demandProposal().supplier(),
                        MODEL.demandProposal().demand().submitter(),
                        MODEL.demandProposal().demandProposalLogList())

                .query(MODEL.demandProposal()).list_of("check by user").with_string("demand id").with_string("mobile")
                .comments("查询用户提交的 需求 下的所有 demand-proposal")
                .do_it_as()
                .where(MODEL.demandProposal().supplier().adminMobile().eq("${mobile}"),
                        MODEL.demandProposal().demand().eq("${demand id}"))
                .wants(MODEL.demandProposal().supplierStatus(),
                        MODEL.demandProposal().demandProposalTradeList(),
                        MODEL.demandProposal().supplier())

                .query(MODEL.demandProposal()).list_of("wait connect by supplier").with_string("mobile")
                .comments("查询需要厂家确认对接的 demand-proposal")
                .do_it_as()
                .run_by((it) -> {
                    return queryBySubmitter(it, DemandProposalStatus.WAIT_CONNECT);
                })
                .top("")

                .query(MODEL.demandProposal()).list_of("wait deal by supplier").with_string("mobile")
                .comments("查询需要厂家确认成交的 demand-proposal")
                .do_it_as()
                .run_by((it) -> queryBySubmitter(it, DemandProposalStatus.WAIT_DEAL))

                .query(MODEL.demandProposal()).list_of("closed for supplier").with_string("mobile")
                .comments("查询对厂家来说已经关闭的 demand-proposal")
                .do_it_as()
                .run_by((it) -> queryBySubmitter(it, DemandProposalStatus.COMPLETED, DemandProposalStatus.CANCELLED))

                .query(MODEL.demandProposal()).list_of("processing for supplier").with_string("mobile")
                .comments("查询对厂家来说还在处理中的 demand-proposal")
                .do_it_as()
                .run_by((it) -> queryBySubmitter(it, DemandProposalStatus.CONNECTED, DemandProposalStatus.DEAL, DemandProposalStatus.ACCOUNTING))


                .query(MODEL.demandProposal()).list_of("need check by user").pagination().with_string("mobile").with_string("supplier status")
                .comments("查询用户负责,某个状态的 demand-proposal")
                .do_it_as()
                .where(MODEL.demandProposal().supplier().adminMobile().eq("${mobile}"),
                        MODEL.demandProposal().supplierStatus().eq("${supplier status}"))
                .wants(MODEL.demandProposal().supplierStatus(),
                        MODEL.demandProposal().supplier(),
                        MODEL.demandProposal().demand().submitter())
                .order_by(MODEL.demandProposal().id()).desc()
                .order_by(MODEL.demandProposal().title()).desc()
                .order_by(MODEL.demandProposal().demand().id()).asc()

                .find(MODEL.demandProposal()).which("need check by user").with_string("proposal id")
                .comments("在供应商需求详情页面加载 需求建议")
                .do_it_as().count()
                .where(MODEL.demandProposal().id().eq("${proposal id}"))
                .wants(MODEL.demandProposal().userStatus(),
                        MODEL.demandProposal().demandProposalTradeList(),
                        MODEL.demandProposal().supplier(),
                        MODEL.demandProposal().demand().submitter(),
                        MODEL.demandProposal().demand().unitType(),
                        MODEL.demandProposal().demand().demandStatus(),
                        MODEL.demandProposal().demandProposalLogList())



                ;
    }

    private PageFlowScript queryBySubmitter(PageFlowScript script, Object... statusCode) {
        return script.where(MODEL.demandProposal().supplier().adminMobile().eq("${mobile}").optional(),
                MODEL.demandProposal().supplierStatus().in(statusCode))
                .wants(MODEL.demandProposal().supplierStatus(),
                        MODEL.demandProposal().supplier(),
                        MODEL.demandProposal().demand().submitter());
    }
}
