package Lab5;

public class B extends A{
    protected String b;

    public B (String b){
        super("a",new X("x"));
        this.b = b;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b;
    }
}
