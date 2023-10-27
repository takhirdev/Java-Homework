public class Kelvin implements BaseConverter{
    double kelvin;
    @Override
    public void converter(int celsius) {
        System.out.println(kelvin = celsius + 273.15);
    }
}
