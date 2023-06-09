package basicSyntaxis;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        for (int position = username.length()-1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;

        }
        String enterPsw = scanner.nextLine();
        int count = 0;
        while (!enterPsw.equals(password)){
            count++;
            if(count == 4 ){
                System.out.printf("User %s blocked!",username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enterPsw = scanner.nextLine();
        }
        if(enterPsw.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
