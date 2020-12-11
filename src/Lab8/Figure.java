package Lab8;

abstract class Figure {
    int figure;

    public Figure(int figure){
        this.figure = figure;
    }

    public abstract double getSurface();
    public abstract double getVolume();

}
