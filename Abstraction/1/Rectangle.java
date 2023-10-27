public class Rectangle extends GeometricFigure{
    private int sideA,sideB;
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    void area() {
        int S = sideA * sideB;
        System.out.println(S);
    }
    @Override
    void perimeter() {
        int P = 2 * (sideA + sideB);
        System.out.println(P);
    }
}
