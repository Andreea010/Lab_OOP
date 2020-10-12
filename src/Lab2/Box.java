package Lab2;

public class Box {
    int height;
    int width;
    int depth;

    Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(int a){
        this.height = a;
        this.width = a;
        this.depth = a;
    }

    Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public int surface(){
        return 2 *(depth * height + width * height + depth * width);
    }

    public int volume (){
        return height * depth * width;
    }

    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box(15);
        Box b3 = new Box(19, 18,19);

        System.out.println("Box1 has width of " + b1.width + "cm, height of " + b1.height +
                "cm, depth of " + b1.depth + "cm, surface area of " + b1.surface() +
                "cm^2 and volume of " + b1.volume() + "cm^3");

        System.out.println("Box2 has width of " + b2.width + "cm, height of " + b2.height +
                "cm, depth of " + b2.depth + "cm, surface area of " + b2.surface() +
                "cm^2 and volume of " + b2.volume() + "cm^3");

        System.out.println("Box3 has width of " + b3.width + "cm, height of " + b3.height +
                "cm, depth of " + b3.depth + "cm, surface area of " + b3.surface() +
                "cm^2 and volume of " + b3.volume() + "cm^3");

    }
}




