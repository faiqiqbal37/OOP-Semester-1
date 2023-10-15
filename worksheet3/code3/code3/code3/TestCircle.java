public class TestCircle {
    public static void main(String[] args) {
        System.out.println(Circle.PI);
        System.out.println(Circle.radToDeg(54));

        Circle circleOne = new Circle(15);
        Circle circleTwo = new Circle(15);

        System.out.println(circleOne.equals(circleTwo));


        System.out.println(circleOne.toString());

    }


}
