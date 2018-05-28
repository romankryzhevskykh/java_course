package ua.testproject;

public class Test {
    public static void main(String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5);
        System.out.println(s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("треугольник " + r.a + " " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}
