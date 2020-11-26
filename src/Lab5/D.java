package Lab5;

public class D extends C {
    protected String d;

    public D (String d){
        super("c");
        this.d = d;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d;
    }
}
