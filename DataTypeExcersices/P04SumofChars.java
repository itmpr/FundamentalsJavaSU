package DataTypeExcersices;

import java.util.Scanner;

public class P04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int count = 1; count <= n; count++) {
            char  letter = scanner.nextLine().charAt(0);
            int asciCode = (int) letter;
            sum += asciCode;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
