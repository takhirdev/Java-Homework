public class Triangle extends GeometricFigure{
    private int sideA,sideB,sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    void area() {
        double p = (sideA + sideB + sideC) / 2;
        double S = Math.sqrt(p * (p - sideA) * (p- sideB) * (p-sideC));
        System.out.println(S);
    }
    @Override
    void perimeter() {
        int P = sideA + sideB + sideC;
        System.out.println(P);
    }
}
