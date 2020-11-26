package Lab7;

public class Main {
    public static void main(String[] args) {
        {

            Square square = new Square(10) {
                public double getArea() {
                    return side * side;
                }

                public double getPerimeter() {
                    return side * 4;
                }
            };

            Rectangle rectangle = new Rectangle(8, 3) {
                public double getArea() {
                    return length * width;
                }

                public double getPerimeter() {
                    return (length + width) * 2;
                }
            };

            Triangle triangle = new Triangle(12, 20, 16) {
                public double getArea() {
                    return Math.sqrt(((sideA + sideB + sideC) / 2) * ((sideA + sideB + sideC) / 2 - sideA)
                            * ((sideA + sideB + sideC) / 2 - sideB) * ((sideA + sideB + sideC) / 2 - sideC));
                }

                public double getPerimeter() {
                    return sideA + sideB + sideC;
                }
            };

            Figure circle = new Figure(15) {
                double Pi = 3.14;

                public double getArea() {
                    return figure * figure * Pi;
                }

                public double getPerimeter() {
                    return 2 * Pi * figure;
                }
            };

            System.out.println("The square's area is " + square.getArea());
            System.out.println("The square's perimeter is " + square.getPerimeter());

            System.out.println("The rectangle's area is " + rectangle.getArea());
            System.out.println("The rectangle's parameter is " + rectangle.getPerimeter());

            System.out.println("The triangle's area is " + triangle.getArea());
            System.out.println("The triangle's perimeter is " + triangle.getPerimeter());

            System.out.println("The circle's area is " + circle.getArea());
            System.out.println("The circle's perimeter is " + circle.getPerimeter());
        }
    }
}
