package Lab1;

public class Student {

    String name;
    int age;
    double mark;
    double average;
    
    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public double getmark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


}
