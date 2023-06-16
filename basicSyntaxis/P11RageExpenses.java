package basicSyntaxis;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLoseGame = Integer.parseInt(scanner.nextLine());
        double priceHeadsets = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadsets = countLoseGame / 2;
        int countMouse = countLoseGame / 3;
        int countKeaboard = countLoseGame / 6;
        int countDisplay = countLoseGame / 12;

        double totalPrice = (countHeadsets*priceHeadsets)
                        + (countMouse*priceMouse)
                        + (countKeaboard*priceKeyboard)
                        + (countDisplay*priceDisplay);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
