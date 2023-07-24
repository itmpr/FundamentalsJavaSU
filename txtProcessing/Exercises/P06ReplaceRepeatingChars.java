package txtProcessing.Exercises;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        for (int position = 0; position < textBuilder.length() - 1; position++) {
            if (textBuilder.charAt(position) == textBuilder.charAt(position+1)){
                textBuilder.deleteCharAt(position);
                position--;
            }
        }
        System.out.println(textBuilder);
    }
}
