package Lab8;

public abstract class Parallelepiped extends Figure {
    int width;
    int height;
    int length;


    public Parallelepiped(int width, int height, int length){
        super(0);
        this.width = width;
        this.height = height;
        this.length = height;
    }
}
