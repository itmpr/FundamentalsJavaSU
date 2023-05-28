package DataTypeExcersices;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int capacityTank = 255;
        int sum = 0;
        for (int line = 1; line <= n; line++) {
            int currLiters = Integer.parseInt(scanner.nextLine());
            if (sum + currLiters > capacityTank){
                System.out.println("Insufficient capacity!");
            }else {
                sum += currLiters;
            }
        }
        System.out.println(sum);
    }
}
