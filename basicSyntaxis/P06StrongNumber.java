package basicSyntaxis;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; //first value of number
        int sumFact = 0;
        while (number > 0) {
            int fact = 1;
            int lastDigit = number % 10; //take last digit
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            number /= 10; //removww last digit
        }
        if (sumFact==startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
