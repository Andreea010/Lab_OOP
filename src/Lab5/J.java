package Lab5;

public class J extends I{
    protected String j;

    public J(String j){
        super("i");
        this.j = j;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f
                + ", " + g + ", " + h + ", " + i + ", " + j;
    }

}

