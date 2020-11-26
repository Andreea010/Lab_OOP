package Lab5;

public class C extends B{
    protected String c;

    public C(String c){
        super("b");
        this.c = c;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c;
    }
}
