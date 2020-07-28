package test.terapico.query;

import com.terapico.generator.Utils;

public class TestMain {
    public static void dump(Object obj) {
        System.out.println(Utils.toJson(obj, true));
    }
    public static void main(String[] args) throws Exception {
        Case1 case1 = new Case1();
        case1.run();
    }
}
