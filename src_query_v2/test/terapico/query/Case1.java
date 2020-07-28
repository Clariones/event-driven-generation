package test.terapico.query;

import com.terapico.changerequest.generator.GenerationHelper;
import com.terapico.datatype.BasicType;
import com.terapico.query.terms.*;

public class Case1 {
    public void run() throws Exception {
        Path path1 = makePath1();
//        TestMain.dump(path1);
        Path path2 = makePath2();
        LogicalExpression exp1 = Operator.EQUALS.of(path1, "${value1}");
        LogicalExpression exp2 = Operator.EQUALS.of(path2, "${value2}");

        LogicalExpression exp3 = exp1.or(exp2).not();

        TestMain.dump(exp3);
    }

    private Path makePath1() {
        return Path.startFrom("A")
                .gotoNode("B").leaveThrough("ab1")
                .gotoNode("C").enterThrough("cb")
                .withAttribute(BasicType.COMMON_STRING, "prop1")
                ;
    }

    private Path makePath2() {
        return Path.startFrom("A")
                .gotoNode("B").leaveThrough("ab2")
                .gotoNode("C").enterThrough("cb")
                .withAttribute(BasicType.COMMON_STRING, "prop1")
                ;
    }
}
