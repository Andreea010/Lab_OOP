package Lab5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A o1 = new A("a",new X(""));
        B o2 = new B("b");
        C o3 = new C("c");
        D o4 = new D("d");
        E o5 = new E("e");
        F o6 = new F("f");
        G o7 = new G("g");
        H o8 = new H("h");
        I o9 = new I("i");
        J o10 = new J("j");
        List<Object> objectList = new ArrayList<Object>();
        objectList.add(o1);
        objectList.add(o2);
        objectList.add(o3);
        objectList.add(o4);
        objectList.add(o5);
        objectList.add(o6);
        objectList.add(o7);
        objectList.add(o8);
        objectList.add(o9);
        objectList.add(o10);
        System.out.print(objectList);
        }
}
