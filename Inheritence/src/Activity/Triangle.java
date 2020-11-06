package Activity;
/**
 * Class that represent the object of a triangle
 * 
 * @author Craig Kimball
 * date: 11/5/2020
 */
public class Triangle implements Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    /**
     * Base level constructor for triangle object. Creates an equilaterall triangle with side lengths of 1
     */
    public Triangle(){
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    /**
     * Constructor for creating a triangle object. Creates a triangle with side lengths a,b,and c.
     * 
     * @param a side a
     * @param b side b
     * @param c side c : longest side
     */
    public Triangle(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        
    }

    
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.sqrt(
            (getPerimeter()*(
                ((.5*getPerimeter())-sideA)*((.5*getPerimeter())-sideB)*((.5*getPerimeter())-sideC)
            )
        ));
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return sideA+sideB+sideC;
    }
    
}
