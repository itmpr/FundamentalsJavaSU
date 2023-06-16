package Methods.Excersices;

import java.util.Scanner;

public class P09Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            //check if txt is palindrom
            if (checkPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }


            input = scanner.nextLine();
        }
    }

    // method check if text is palindrome
    public static boolean checkPalindrome(String text) {
        //txt = "Desi"
        //reversedTxt = iseD
        //txt is equal (reversedTxt)

        String reversedText = "";
        for (int index = text.length() -1 ; index >=0; index--) {
            reversedText += text.charAt(index);

        }
        return text.equals(reversedText);
    }
}

