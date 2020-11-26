package Lab7;

public abstract class Rectangle extends Figure{
    int length;
    int width;

    public Rectangle(int length, int width){
        super(0);
        this.length = length;
        this.width = width;
    }
}
