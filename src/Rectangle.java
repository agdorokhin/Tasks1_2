public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

    public double area() {
        return (double)Math.round(width*height*100)/100;
    }

    public String toString(){
        return("The rectangle area is: "+this.area());
    }
}
