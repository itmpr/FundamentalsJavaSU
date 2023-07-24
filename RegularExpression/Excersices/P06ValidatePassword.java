package RegularExpression.Excersices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String passwordRegex = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(passwordRegex);

        for (int row = 1; row <= n ; row++) {
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()){
                //_...ChelseA_.
                String textPassword = matcher.group("passwordText");//ChelseA
                StringBuilder sbCategory = new StringBuilder();
                for(char symbol : textPassword.toCharArray()){
                    if (Character.isDigit(symbol)){ // if in psw has number
                        sbCategory.append(symbol);
                    }
                }
                //default
                if (sbCategory.length() == 0){
                    System.out.println("Group: default");
                }else {
                    System.out.println("Group: " + sbCategory.toString());
                }
            }else {
                System.out.println("Invalid pass!");
            }

        }
    }
}
