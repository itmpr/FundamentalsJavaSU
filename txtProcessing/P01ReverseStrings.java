package txtProcessing;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("end")) {

            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                char symbol = word.charAt(i);

                reversedWord = reversedWord + symbol;
            }

            System.out.printf("%s = %s%n", word, reversedWord);

            word = scanner.nextLine();
        }

    }
}
