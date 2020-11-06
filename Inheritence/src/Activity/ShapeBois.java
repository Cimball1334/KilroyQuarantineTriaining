package Activity;
/**
 * Class created to handle the instatiation of shape objects
 */
public class ShapeBois {

    public static void main(String[] args) {
        
        Triangle tod = new Triangle(3.0, 6.0, 3.718);
        Triangle timmy = new Triangle();

        RightTriangle richard = new RightTriangle(2,2);

        System.out.println(tod.getArea());
        System.out.println(tod.getPerimeter());

        System.out.println(timmy.getArea());

        System.out.println(richard.getArea());
        System.out.println(richard.getPerimeter());

    }

}
