import java.util.Scanner;

class
Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        double number1 = input.nextDouble();

        System.out.println("Enter the operator: (+ - * /)");
        String operator = input.next();

        System.out.println("Enter the second Number:");
        double number2 = input.nextDouble();
        
        calculator(number1, operator, number2);
    }

    private static void calculator(double number1, String operation, double number2) {
        double result;

        switch(operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Operator is invalid. Something went wrong");
                return;
        }

        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }
}