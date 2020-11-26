package Lab5;

public class E extends D {
    protected String e;

    public E (String e){
        super("d");
        this.e = e;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d + ", " + e;
    }
}
