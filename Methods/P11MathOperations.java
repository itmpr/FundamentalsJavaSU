package Methods;

import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(computation(operator,num1,num2));

    }

    public static int computation(char op, int num1, int num2) {
        int sum = 0;
        switch (op) {
            case '/':
                sum = num1 / num2;
            break;
            case '*':
                sum = num1 * num2;
            break;
            case '+':
                sum = num1 + num2;
            break;
            case '-':
                sum = num1 - num2;
            break;
        }
        return sum;
    }

}
