public class Main {

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = findMax(5, 9);
        System.out.println(result);
    }
}
