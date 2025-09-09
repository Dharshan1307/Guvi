package Day2;

public class demo1 {
    int a, b, c;

    
    demo1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void add() {
        String s = "Local variable";
        c = a + b;
        System.out.println("Sum = " + c);
    }

   
    public static void main(String[] args) {
        demo1 obj1 = new demo1(4, 5);
        obj1.add();

        demo1 obj2 = new demo1(5, 6);
        obj2.add();
    }
}
