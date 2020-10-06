package Lab1;

public class Monitor {
    String color;
    int resolution;
    int dimention;

    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        m1.color = "black";
        m1.dimention = 1440;
        m1.resolution = 16;

        Monitor m2 = new Monitor();
        m2.color = "black";
        m2.dimention = 1440;
        m2.resolution = 16;

        System.out.println("Monitor1 - color: " + m1.color + ", dimention: " +
                m1.dimention + ", " + "resolution: " + m1.resolution + " inches");
        System.out.println("Monitor2 - color: " + m2.color + ", dimention: " +
                m2.dimention + ", " + "resolution: " + m2.resolution + " inches");
        if (m2.color == m1.color) System.out.println("Monitor1 has the same color as Monitor2");
        else System.out.println("\"Monitor1 does not have the same color as Monitor2\"");
    }
}