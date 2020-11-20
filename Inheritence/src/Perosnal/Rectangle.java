package Inheritence.src.Perosnal;
/**
 * 
 * Rectangle Object
 * Defines the rectangle instance of a Quadrillateral
 * 
 * @author Craig Kimball
 * Date 10/29/2020
 */


public class Rectangle implements Quadrillateral {
private int length;
private int width;

/**
 * Default Constructor 
 * Creates a rectangle with side length 1 x 3
 */
public Rectangle(){
     this(1,3);
}
/**
 * 
 * @param L
 * Length of the rectangle
 * @param W
 * width of the rectangle
 */
public Rectangle(int L, int W){
    length = L;
    width = W;
}
/**
 * Calculates the Area of a rectangle shape
 * @return double 
 */
@Override
public double getArea(){

    return length*width;
}
/**
 * Calculates the Perimeter of a rectangle shape
 * @return double
 */
@Override
public double getPerimeter(){

    return 2*(length+width);
}
/**
 * Gets the name of the shape
 * @return String
 */
@Override
public String getShape(){
return "Rectangle";
}

}
