public class MaxOfThree {
    int max(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        MaxOfThree obj = new MaxOfThree();
        int result = obj.max(10, 25, 15);
        System.out.println(result);
    }
}
