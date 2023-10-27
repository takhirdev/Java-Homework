public class MathFuntions {
    static float PI;
    static double E;

    static {
        PI = 3.14F;
        E = 3;
    }

    public static void main(String[] args) {
        System.out.println(CircleYuzi(12));
        System.out.println(Power(2));
        System.out.println(Geron(3, 4, 5));
    }
   public static double CircleYuzi(double radius){
        double result = PI * radius * radius;
        return result;
    }
   public static double Power(double a){
        return Math.pow(E,a);
    }
   public static double Geron(int a, int b, int c){
        double p = (a + b + c) / 2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
