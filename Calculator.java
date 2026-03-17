public class Calculator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        String operation = "add";   // change: add, sub, mul, div

        int result;

        switch (operation.toLowerCase()) {
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.out.println("Division by zero error");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Operation: " + operation);
        System.out.println("Result: " + result);
    }
}
