import java.util.Scanner;

class MenuCalculator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runCalculator();
    }

    public static void runCalculator() {
        int choice = getChoice();
        int num1 = getNumber();
        int num2 = getNumber();
        int result = calculate(choice, num1, num2);
        displayResult(result);
    }

    public static int getChoice() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        return readInt();
    }

    public static int getNumber() {
        return readInt();
    }

    public static int readInt() {
        while (true) {
            String s = input.nextLine().trim();
            try {
                if (s.endsWith(".")) s = s.substring(0, s.length() - 1);
                return Integer.parseInt(s);
            } catch (Exception e) {
                // try again
            }
        }
    }

    public static int calculate(int choice, int a, int b) {
        if (choice == 1) return add(a, b);
        if (choice == 2) return subtract(a, b);
        return multiply(a, b);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void displayResult(int result) {
        System.out.println(result);
    }
}