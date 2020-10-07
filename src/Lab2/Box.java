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

    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(5, 8,9);

        System.out.println("Box1" + b1 + "cm");

        System.out.println("Box2 has width of " + b2.width + "cm, height of " + b2.height +
                "cm and depth of " + b2.depth + "cm.");

        System.out.println("Box3 has width of " + b3.width + "cm, height of " + b3.height +
                "cm and depth of " + b3.depth + "cm.");

    }
}




