public class CircleApp {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(2, 3, 3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1.isEnclosedBy(c2));
        System.out.println(c1.isEnclosedBy(c3));
        System.out.println(c2.isOverlappedWith(c3));
        System.out.println(c1.isOverlappedWith(c3));
        c1.scale(3);
        System.out.println(c1);
        c1.move(1,1);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.getRadius());
        System.out.println(c1.getOriginX());
        System.out.println(c1.getOriginY());
        c1.setRadius(5);
        c1.setOriginX(6);
        c1.setOriginY(8);
        System.out.println(c1.getRadius());
        System.out.println(c1.getOriginX());
        System.out.println(c1.getOriginY());
    }
}
