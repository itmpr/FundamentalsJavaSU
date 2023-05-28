package DataTypeExcersices;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = Integer.parseInt(scanner.nextLine());
        while(number > 0){
            int lstDigit = number % 10;
            sum += lstDigit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
