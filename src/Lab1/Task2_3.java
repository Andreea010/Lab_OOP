package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Task2_3 {

    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, 9.2);
        Student s2 = new Student("Vasile", 19, 6.4);
        Student s3 = new Student("Denis", 20, 8.0);
        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        double average1 = (s1.mark + s2.mark + s3.mark) / 3;

        Student s4 = new Student("Stefan", 20, 10);
        Student s5 = new Student("Daniela", 21, 9.5);
        Student s6 = new Student("Carmen", 20, 7.0);
        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(s4);
        studentList2.add(s5);
        studentList2.add(s6);
        double average2 = (s4.mark + s5.mark + s6.mark) / 3;

        Student s7 = new Student("Pavel", 19, 7.8);
        Student s8 = new Student("Laura", 20, 9.4);
        Student s9 = new Student("Ana", 21, 8.7);
        List<Student> studentList3 = new ArrayList<Student>();
        studentList3.add(s7);
        studentList3.add(s8);
        studentList3.add(s9);
        double average3 = (s7.mark + s8.mark + s9.mark) / 3;

        University u1 = new University("UTM", 1970);
        University u2 = new University("ULIM", 1940);
        University u3 = new University("USM", 1959);

        System.out.println("University: " + u1.name + ", Year of Foundation: " + u1.foundationYear);
        for (Student student : studentList1) {
            System.out.println ("Students - Name: " + student.name + "," + " age: " + student.age + "," +
                    " Mark: " + student.mark); }

        System.out.println("Average student mark: " + average1);

        System.out.println("\n" + "University: " + u2.name + ", Year of Foundation: " + u2.foundationYear);
        for (Student student : studentList2) {
            System.out.println ("Students - Name: " + student.name + "," + " age: " + student.age + "," +
                    " Mark: " + student.mark); }
        System.out.println("Average student mark: " + average2);

        System.out.println("\n" + "University: " + u3.name + ", Year of Foundation: " + u3.foundationYear);
        for (Student student : studentList3) {
            System.out.println ("Students - Name: " + student.name + "," + " age: " + student.age + "," +
                    " Mark: " + student.mark); }
        System.out.println("Average student mark: " + average3);
    }
}
