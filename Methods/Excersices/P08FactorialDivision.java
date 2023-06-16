package Methods.Excersices;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber =Integer.parseInt(scanner.nextLine());
        int secondNumber =Integer.parseInt(scanner.nextLine());

        //factorial of firstNumber
        long factFirstNumber = computeFactorial(firstNumber);

        //factoriel of secondNumber
        long factSecondNumber = computeFactorial(secondNumber);

        //f1 / f2 -> %.2f
        double result = factFirstNumber * 1.0 / factSecondNumber;
        System.out.printf("%.2f", result);

    }

    //compute factorial of 20! is very long number
    public static long computeFactorial(int number){
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}
