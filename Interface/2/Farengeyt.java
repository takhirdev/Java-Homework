public class Farengeyt implements BaseConverter{
    double farengeyt;
    @Override
    public void converter(int celsius) {
        System.out.println(farengeyt = ((celsius * 9) / 5) + 32);
    }
}
