package cla.edg.project.yrcms.gen.graphquery;

public class MODEL {
  public static String getBasePackageName() {
    return "com.yrdec.yrcms";
  }

  public static Platform platform() {
    Platform rst = new Platform();
    rst.setModelTypeName("platform");
    return rst;
  }

  public static MobileApp mobileApp() {
    MobileApp rst = new MobileApp();
    rst.setModelTypeName("mobile_app");
    return rst;
  }

  public static Page page() {
    Page rst = new Page();
    rst.setModelTypeName("page");
    return rst;
  }

  public static PageType pageType() {
    PageType rst = new PageType();
    rst.setModelTypeName("page_type");
    return rst;
  }

  public static Slide slide() {
    Slide rst = new Slide();
    rst.setModelTypeName("slide");
    return rst;
  }

  public static UiAction uiAction() {
    UiAction rst = new UiAction();
    rst.setModelTypeName("ui_action");
    return rst;
  }

  public static Section section() {
    Section rst = new Section();
    rst.setModelTypeName("section");
    return rst;
  }

  public static PlatformConfiguration platformConfiguration() {
    PlatformConfiguration rst = new PlatformConfiguration();
    rst.setModelTypeName("platform_configuration");
    return rst;
  }

  public static IconConfiguration iconConfiguration() {
    IconConfiguration rst = new IconConfiguration();
    rst.setModelTypeName("icon_configuration");
    return rst;
  }

  public static ArticleCategory articleCategory() {
    ArticleCategory rst = new ArticleCategory();
    rst.setModelTypeName("article_category");
    return rst;
  }

  public static Article article() {
    Article rst = new Article();
    rst.setModelTypeName("article");
    return rst;
  }

  public static ArticleParagraph articleParagraph() {
    ArticleParagraph rst = new ArticleParagraph();
    rst.setModelTypeName("article_paragraph");
    return rst;
  }

  public static WelcomeSlide welcomeSlide() {
    WelcomeSlide rst = new WelcomeSlide();
    rst.setModelTypeName("welcome_slide");
    return rst;
  }

  public static PageArticle pageArticle() {
    PageArticle rst = new PageArticle();
    rst.setModelTypeName("page_article");
    return rst;
  }

  public static UserDomain userDomain() {
    UserDomain rst = new UserDomain();
    rst.setModelTypeName("user_domain");
    return rst;
  }

  public static UserAllowList userAllowList() {
    UserAllowList rst = new UserAllowList();
    rst.setModelTypeName("user_allow_list");
    return rst;
  }

  public static SecUser secUser() {
    SecUser rst = new SecUser();
    rst.setModelTypeName("sec_user");
    return rst;
  }

  public static UserApp userApp() {
    UserApp rst = new UserApp();
    rst.setModelTypeName("user_app");
    return rst;
  }

  public static QuickLink quickLink() {
    QuickLink rst = new QuickLink();
    rst.setModelTypeName("quick_link");
    return rst;
  }

  public static ListAccess listAccess() {
    ListAccess rst = new ListAccess();
    rst.setModelTypeName("list_access");
    return rst;
  }

  public static LoginHistory loginHistory() {
    LoginHistory rst = new LoginHistory();
    rst.setModelTypeName("login_history");
    return rst;
  }

  public static CandidateContainer candidateContainer() {
    CandidateContainer rst = new CandidateContainer();
    rst.setModelTypeName("candidate_container");
    return rst;
  }

  public static CandidateElement candidateElement() {
    CandidateElement rst = new CandidateElement();
    rst.setModelTypeName("candidate_element");
    return rst;
  }

  public static WechatWorkappIdentity wechatWorkappIdentity() {
    WechatWorkappIdentity rst = new WechatWorkappIdentity();
    rst.setModelTypeName("wechat_workapp_identity");
    return rst;
  }

  public static WechatMiniappIdentity wechatMiniappIdentity() {
    WechatMiniappIdentity rst = new WechatMiniappIdentity();
    rst.setModelTypeName("wechat_miniapp_identity");
    return rst;
  }

  public static KeypairIdentity keypairIdentity() {
    KeypairIdentity rst = new KeypairIdentity();
    rst.setModelTypeName("keypair_identity");
    return rst;
  }

  public static PublicKeyType publicKeyType() {
    PublicKeyType rst = new PublicKeyType();
    rst.setModelTypeName("public_key_type");
    return rst;
  }

  public static TreeNode treeNode() {
    TreeNode rst = new TreeNode();
    rst.setModelTypeName("tree_node");
    return rst;
  }
}
