package actividad11;

/**
 *
 * @author judi_
 */
public class Square extends Shape{
    
     protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double area() {
        
        System.out.println("Area: ");
        return sideLength * sideLength;
    }

    public double perimeter() {
        
        System.out.println("Perimetro: ");
        return sideLength * 4;
    }
    
}
