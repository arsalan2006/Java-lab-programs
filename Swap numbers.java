public class SwapNumbers {
    int num;

    SwapNumbers(int n) {
        num = n;
    }

    static void swap(SwapNumbers a, SwapNumbers b) {
        int temp = a.num;
        a.num = b.num;
        b.num = temp;
    }

    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(10);
        SwapNumbers obj2 = new SwapNumbers(20);

        swap(obj1, obj2);

        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }
}
