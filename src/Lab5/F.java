package Lab5;

public class F extends E {
    protected String f;

    public F (String f){
        super("e");
        this.f = f;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f;
    }
}

