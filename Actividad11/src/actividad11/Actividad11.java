package actividad11;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author judi_
 */
public class Actividad11 {

    public static void main(String[] args) {
        
        Scanner val = new Scanner(System.in);
        int op;
        double valor;
        
        
        System.out.println("Bienvenido");
        System.out.println("Elige una opcion: ");
        System.out.println("1. Calcular circulo");
        System.out.println("2. Calcular Cuadrado");
        System.out.println("3. Calcular triangulo");
        op = val.nextInt();
            
        switch(op)
        {
            
            case 1:
                System.out.println("Circle");
                System.out.println("Introduce el valor del radio: ");
                valor = val.nextDouble();
                Circle circle = new Circle(valor);
                System.out.println(circle.area());
                System.out.println(circle.perimeter());
                break;
                
            case 2:
                System.out.println("Square");
                System.out.println("Introduce el valor del lado: ");
                valor = val.nextDouble();
                Square square = new Square(valor);
                System.out.println(square.area());
                System.out.println(square.perimeter());
                break;
                
            case 3:

                System.out.println("Trriangle");
                System.out.println("Introduce el valor del lado: ");
                valor = val.nextDouble();
                Triangle triangle = new Triangle(valor);
                System.out.println(triangle.area());
                System.out.println(triangle.perimeter());
                break;
                
            default:
                System.out.println("Opcion es incorrecta");
                break;
        }
        
        
    }
    
}
