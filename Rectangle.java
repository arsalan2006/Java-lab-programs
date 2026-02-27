public class Rectangle {
    double area(double l, double w) {
        return l * w;
    }

    double perimeter(double l, double w) {
        return 2 * (l + w);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        double a = obj.area(10, 5);
        double p = obj.perimeter(10, 5);
        System.out.println(a);
        System.out.println(p);
    }
}
