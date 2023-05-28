package DataTypeExcersices;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYeild = Integer.parseInt(scanner.nextLine());
        int totalAmount = startYeild;
        int days = 0;
        int dayAmount = 0;
        while (startYeild >= 100) {
            dayAmount += startYeild - 26;
            startYeild -= 10;
            days ++;
        }
        if (startYeild < 100 && days == 0){
            System.out.println(days);
            System.out.println(dayAmount);
        } else {
            dayAmount -= 26;
            System.out.println(days);
            System.out.println(dayAmount);
        }
    }

}
