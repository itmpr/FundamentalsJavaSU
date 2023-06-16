package Methods.Excersices;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String psw = scanner.nextLine();
        PasswordValid(psw);

    }

    public static void PasswordValid(String pass) {
        boolean length = false;
        boolean letterDigits = true;
        boolean digits2 = false;
        int countDigits = 0;

        if (pass.length() >= 6 && pass.length() <= 10) {
            length = true;

        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }

        for (int index = 0; index < pass.length(); index++) {
            char currSymbol = pass.charAt(index);
            // symbol [48-57] numbers
            //letters [65,90] && [97,122]
            if ((int) currSymbol >= 48 && (int) currSymbol <= 57) {
                countDigits++;

            }
            if ((int)currSymbol < 48 || (int)currSymbol > 122 ||
                    (int)currSymbol > 90 && (int)currSymbol < 97 ||
                    (int)currSymbol > 57 && (int)currSymbol < 65)
            {
                letterDigits = false;
            }
        }

        if (letterDigits == false) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (countDigits < 2) {
            System.out.println("Password must have at least 2 digits");
        }

        if (length && letterDigits && digits2){
            System.out.println("Password is valid");
        }
    }
}
