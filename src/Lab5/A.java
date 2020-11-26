package Lab5;

public class A {
    protected String a;
    protected X variable = new X("letter");

    public A(String string, X variable) {
        this.a = string;
    }

    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a;
    }
}