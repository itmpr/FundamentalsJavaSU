package DataTypeExcersices;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        //1. int -> String
        //2. each simbols(digits)
        //index of 0 to the last symbol

        String numberAsString = "" + n;
        for (int position = 0; position <= numberAsString.length() - 1; position++) {
            char currSymbol = numberAsString.charAt(position);
            //char -> String -> int
            int currDigit = Integer.parseInt(currSymbol + "");
            sum += currDigit;
        }
        System.out.println(sum);


    }
}
