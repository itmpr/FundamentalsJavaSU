package txtProcessing.Exercises;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String firstArg = input[0];
        String secondArg = input[1];

        System.out.println(sumCharacters(firstArg, secondArg));
    }
    public static int sumCharacters(String arg1, String arg2) {

        int sum = 0;
        int minLength = Math.min(arg1.length(), arg2.length());

        for (int index = 0; index < minLength; index++) {
            sum += (arg1.charAt(index) * arg2.charAt(index));
        }

        if (arg1.length() > arg2.length()) {
            for (int index = minLength; index < arg1.length(); index++) {
                sum += arg1.charAt(index);
            }
        } else if (arg2.length() > arg1.length()) {
            for (int index = minLength; index < arg2.length(); index++) {
                sum += arg2.charAt(index);
            }
        }
        return sum;
    }
}

