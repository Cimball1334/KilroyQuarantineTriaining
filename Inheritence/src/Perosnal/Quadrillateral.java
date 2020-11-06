package Perosnal;

public interface Quadrillateral {
    
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getShape();

    public default boolean isAShape() {
        return true;
    }
}
