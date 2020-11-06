package Perosnal;/**
 * Creates the Square object
 * Extends Rectangle
 * 
 * @author Craig Kimball
 * Date 10/29/2020
 */
public class Square extends Rectangle {
    
    
/**
 * Constructor of Square Object
 * 
 * @param length 
 * length of one side
 * 
 */
    public Square(int length){
        super(length, length);
    }

    @Override
    public String getShape(){
        return "Square";
    }

}
