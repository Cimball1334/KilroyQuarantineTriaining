package Inheritence.src.Activity;
/**
 * Class that represents the object of a triangle that has one angle of 90 degrees
 * 
 * @author Craig Kimball
 * date: 11/5/2020
 */
public class RightTriangle extends Triangle{
    
    /**
    * This is the constructor creating the instance of each object
    *
    * @param a : side of triangle adjacent to 90 degree angle
    * @param b : side of triangle adjacent to 90 degree angle
    */
    public RightTriangle(double a, double b){
        super(a, b, Math.sqrt( (a*a)+(b*b) ));
    }

    @Override
    public double getArea(){
        return (double)(sideA *sideB)/2.0;
    }

}
