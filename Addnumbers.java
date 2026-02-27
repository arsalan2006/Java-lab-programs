public class AddNumbers {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();
        int result = obj.add(5, 7);
        System.out.println(result);
    }
}
