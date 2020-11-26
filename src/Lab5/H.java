package Lab5;

public class H extends G{
    protected String h;

    public H (String h){
        super("g");
        this.h = h;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f
                + ", " + g + ", " + h;
    }
}
