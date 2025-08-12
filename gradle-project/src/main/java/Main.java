public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world !");
        Box box1 = new Box(2.5, 4.0, 3.0, "red");
        Box box2 = new Box(1.0, 1.5, 2.0, "blue");
        Box box3 = new Box(5.0, 2.0, 1.0, "green");

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
    }
}
