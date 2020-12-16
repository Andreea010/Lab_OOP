package Lab8;

public class FigureController {
    static void getmaxPerimeter() {

        Figure GeometricBody[] = new Figure[3];

        GeometricBody[0] = new Cube(10) {
            @Override
            public double getSurface() {
                return  6 * side * side;
            }

            @Override
            public double getVolume() {
                return side * side * side;
            }
        };
        GeometricBody[1] = new Sphere(8) {
            double Pi = 3.14;
            @Override
            public double getSurface() {
                return 4/3 * Pi * radius ;
            }

            @Override
            public double getVolume() {
                return 4 * Pi * radius * radius;
            }
        };
        GeometricBody[2] = new Parallelepiped(12, 20, 16) {
            @Override
            public double getSurface() {
                return 2 * (length * height + width * height + length * width);
            }

            @Override
            public double getVolume() {
                return length * width * height;
            }
        };

        Figure largest = GeometricBody[0];

        for (int i = 0; i < GeometricBody.length; i++) {
            if (GeometricBody[i].getSurface() > largest.getSurface()) {
                largest = GeometricBody[i];
            }
        }
        System.out.println("The largest surface is : " + largest.getSurface());

        for (int i = 0; i < GeometricBody.length; i++) {
            if (GeometricBody[i].getVolume() > largest.getVolume()) {
                largest = GeometricBody[i];
            }
        }
        System.out.println("The larges vomule is: " + largest.getVolume());
    }
}

