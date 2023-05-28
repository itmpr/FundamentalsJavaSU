package DataTypeExcersices;

import java.util.Scanner;

public class P05PrintPartoftheASCITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int num = startNumber; num <= endNumber ; num++) {
            char  symbol = (char) num;
            System.out.print(symbol + " ");
        }
    }
}
