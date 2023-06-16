package Methods.Excersices;

import java.util.Scanner;

public class P01SmallestofTreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNum,secondNum,thirdNum);

    }

    public static void printSmallestNumber(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3){
            // second num is smallest
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}
