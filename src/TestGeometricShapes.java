import java.util.InputMismatchException;
import java.util.Scanner;
public class TestGeometricShapes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean success=false;

        //Circle test
        double radius = 0;
        double circleArea=0;
        while (!success) {
            try {
                System.out.print("Enter radius of a circle: ");
                radius = s.nextDouble();
                Circle c = new Circle(radius);
                System.out.println(c.toString());
                circleArea=c.area();
                success = true;
            } catch (InputMismatchException e) {
                s.next();
                System.out.println("Yo've entered invalid data. Try again: ");
            }
        }

        //Rectangle test
        double width=0;
        double height=0;
        double rectangleArea=0;
        success=false;

        while (!success) {
            try {
                System.out.print("Enter width of a rectangle: ");
                width=s.nextDouble();
                System.out.print("Enter height of a rectangle: ");
                height=s.nextDouble();
                Rectangle r=new Rectangle(width,height);
                System.out.println(r.toString());
                rectangleArea=r.area();
                success = true;
            } catch (InputMismatchException e) {
                s.next();
                System.out.println("Yo've entered invalid data. Try again: ");
            }
        }

        if (circleArea >= 2*Math.PI*rectangleArea) {
            System.out.println("The rectangle fits into the circle");
        } else {
            System.out.println("The rectangle does not fit into the circle");
        }
        if (Math.sqrt(circleArea/Math.PI) <= Math.sqrt(rectangleArea/2)) {
            System.out.print("The circle fits into the rectangle");
        } else {
            System.out.print("The circle does not fit the rectangle");
        }
    }
}
