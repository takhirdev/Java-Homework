public class Trapezium extends GeometricFigure{
    private int sideA,sideB,high;
    public Trapezium(int sideA, int sideB, int high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }
    @Override
    void area() {
        double S = ((sideA + sideB) / 2) * high;
        System.out.println(S);
    }
    @Override
    void perimeter() {
        int P = 2 * (sideA + sideB);
        System.out.println(P);
    }
}
