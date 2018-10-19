public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public double area() {
        return (double)Math.round(radius*radius*Math.PI*100)/100;
    }

    public String toString() {
        return("The circle area is: "+this.area());
    }
}
