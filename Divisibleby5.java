public class DivisibleByFive {
    void check(int n) {
        if (n % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 5");
    }

    public static void main(String[] args) {
        DivisibleByFive obj = new DivisibleByFive();
        obj.check(25);
    }
}
