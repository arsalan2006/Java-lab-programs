public class Fibonacci {
    void printSeries(int n) {
        int a = 0, b = 1, c;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.printSeries(10);
    }
}
