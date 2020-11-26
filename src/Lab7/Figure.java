package Lab7;

abstract class Figure {
    int figure;

    public Figure(int figure){
        this.figure = figure;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
