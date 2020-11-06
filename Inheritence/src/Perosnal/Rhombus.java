
/**
 * Rhombus Object
 * Defines the rhombus instance of a Quadrillateral
 * 
 * 
 * @author Craig Kimball
 * Date 10/29/2020
 */
package Perosnal;
public class Rhombus implements Quadrillateral{
private int sideLength;
private int diagonalP;
private int diagonalQ;

    /**
     * Default constructor
     * Creates a rhombus with side length 2
     */
    public Rhombus(){
        this(2,1);
    }
    /**
     * Creates a rhombus with only the side length and one diagonal known.
     * Calculates and assigns the correct diagonals by difference in length
     * @param sideLength
     * Length of all the sides
     * @param knownDiagonal
     * shortest diagonal 
     */

    public Rhombus(int sideLength, int diagonal){
        this.sideLength = sideLength;
        int otherDiag = (sideLength*sideLength)-((diagonalP/2)*(diagonalP/2));
        if(diagonal < otherDiag){
            this.diagonalP = diagonal;
            this.diagonalQ = otherDiag;
        }else{
            this.diagonalP = otherDiag;
            this.diagonalQ = diagonal;
        }

    }

    /**
     * Creates a rhombus with all line variables know
     * 
     * @param sideLength
     * Length of each side
     * @param diagonalP
     * shortest diagonal
     * @param diagonalQ
     * longest diagonal
     */

    public Rhombus(int sideLength, int diagonalP, int diagonalQ) {
        
        this.sideLength = sideLength;
        this.diagonalP = diagonalP;
        this.diagonalQ = diagonalQ;

    }
/**
 * Calculates the Area of a rhombus
 * @return double
 */
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (diagonalP*diagonalQ)/2;
    }
    
    @Override
    public String getShape() {
        // TODO Auto-generated method stub
        return "Rhombus";
    }

    /**
     * Calculates the perimeter of a rhombus
     */
    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 4*sideLength;
    }
    
}
