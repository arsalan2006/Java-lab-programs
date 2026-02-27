public class CelsiusToFahrenheit {
    double convert(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit obj = new CelsiusToFahrenheit();
        double result = obj.convert(25);
        System.out.println(result);
    }
}
