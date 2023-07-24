package txtProcessing.Exercises;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // "P34562Z q2576f H456z"
        String[] codes = input.split("\\s+");

        double totalSum = 0;
        for(String code : codes) {
            double modifiedNum = getModifiedNumber(code);
            totalSum += modifiedNum;

        }
        System.out.printf("%.2f",totalSum);
    }
    private static double getModifiedNumber(String code){
        //R234u
        char letterBefore = code.charAt(0); //'R'
        char letterAfter = code.charAt(code.length()-1); //'u'
        double number = Double.parseDouble(code.replace(letterBefore, ' ') //234u
                .replace(letterAfter,' ')            //" 234 "
                .trim());

        if (Character.isUpperCase(letterBefore)){
            int positionUpperLetter = (int) letterBefore - 64;
            number /= positionUpperLetter;
        } else {
            int positionLowerLetter = (int)letterBefore - 96;
            number *= positionLowerLetter;
        }

        if (Character.isUpperCase(letterAfter)) {
            int positionUpperLetter = (int) letterAfter - 64;
            number -= positionUpperLetter;
        } else {
            int positionUpperLetter = (int) letterAfter - 96;
            number += positionUpperLetter;
        }
        return number;
    }
}
