package Lab7;

public abstract class Triangle extends Figure {
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC){
        super(0);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}

