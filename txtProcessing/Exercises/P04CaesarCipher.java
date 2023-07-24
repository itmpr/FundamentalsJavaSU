package txtProcessing.Exercises;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptText = new StringBuilder();

        for(char symbol : text.toCharArray()) {
            char encryptSymbol = (char) (symbol + 3);
            encryptText.append(encryptSymbol);
        }

        System.out.println(encryptText);
    }
}
