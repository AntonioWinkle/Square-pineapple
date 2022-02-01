public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect(2, 4);

        System.out.println("The length is " + rect1.getLength() + " and the width is " + rect1.getWidth());

        rect1.setWidth(5);

        rect1.setLength(2);

        System.out.println("The length is " + rect1.getLength() + " and the width is " + rect1.getWidth());
    }
}
