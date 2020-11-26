package Lab5;

public class I extends H {
    protected String i;

    public I (String i){
        super ("h");
        this.i = i;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className + "- property: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f
                + ", " + g + ", " + h + ", " + i;
    }
}


