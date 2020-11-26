package Lab5;

public class G extends F{
    protected String g;

    public G (String g){
        super("f");
        this.g = g;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f
                + ", " + g;
    }
}
