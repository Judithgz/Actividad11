package actividad11;

/**
 *
 * @author judi_
 */
public class Circle extends Shape {
 
    
    public static final double PI = 3.141592;

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        System.out.println("Diametro: ");
        
        return (radius * 2);
    }

    public double area() {
        System.out.println("Area: ");
        return (PI * radius * radius);
    }

    public double perimeter() {
        System.out.println("Perimetro: ");
        return (PI * getDiameter());
    }
    
    
}
