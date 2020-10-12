package Lab2;

public class queueMain {
    public static void main(String[] args) {
        Queue Queue1 = new Queue(4);
        Queue1.push(20);
        Queue1.push(30);
        Queue1.push(40);
        Queue1.push(50);
        Queue1.pop();
        System.out.println("Size = " + Queue1.getSize());
        System.out.println("Empty = " + Queue1.Empty());
        System.out.println("Full = " + Queue1.Full());

        Queue Queue2 = new Queue();
        Queue2.push(10);
        Queue2.push(100);
        Queue2.push(1000);
        Queue2.pop();
        System.out.println("Size = "+ Queue2.getSize());
        System.out.println("Empty status = "+ Queue2.Empty());

    }
}
