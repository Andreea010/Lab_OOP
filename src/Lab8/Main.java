package Lab8;

public class Main {
    public static void main(String[] args) {
        {
             Cube cube = new Cube(10) {
                public double getSurface() {
                    return  6 * side * side;
                }

                public double getVolume() {
                    return side * side * side;
                }
            };

            Sphere sphere = new Sphere(8) {
                double Pi = 3.14;
                public double getSurface() {
                    return 4/3 * Pi * radius ;
                }

                public double getVolume() {
                    return 4 * Pi * radius * radius;
                }
            };

            Parallelepiped parallelepiped = new Parallelepiped(12, 20, 16) {
                public double getSurface() {
                    return 2 * (length * height + width * height + length * width);
                }

                public double getVolume() {
                    return length * width * height;
                }

            };

                System.out.println("Geometric shape 1 - Cube: " + "surface: " + cube.getSurface() + ", volume: "
                + cube.getVolume());
                System.out.println("Geometric shape 2 - Sphere: " + "surface: " + sphere.getSurface() + ", volume: "
                    + sphere.getVolume());
                System.out.println("Geometric shape 3 - Parallelepiped: " + "surface: " + parallelepiped.getSurface() +
                        ", volume: " + parallelepiped.getVolume());
                        FigureController.getmaxPerimeter();
        }

    }
}

