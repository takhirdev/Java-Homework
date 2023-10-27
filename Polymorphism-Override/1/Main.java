public class Main{
    public static void main(String[] args) {
        GeometricFigure trapezium = new Trapezium(12,14,8);
        GeometricFigure triangle = new Triangle(3,4,5);
        GeometricFigure rectangle = new Rectangle(12,18);
        trapezium.perimeter();
        trapezium.area();
        triangle.perimeter();
        triangle.area();
        rectangle.perimeter();
        rectangle.area();
    }
}