package txtProcessing.Exercises;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);

        int totalStrength = 0;
        for (int position = 0; position <= textBuilder.length() - 1; position++) {
            char currSymbol = textBuilder.charAt(position);

            if (currSymbol == '>') {
                //char '1' -> string "1" -> int 1
                int explosionStrength = Integer.parseInt(textBuilder.charAt(position + 1) + "");
                totalStrength += explosionStrength;
            } else if (currSymbol != '>' && totalStrength > 0) {
                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(textBuilder);

    }
}
