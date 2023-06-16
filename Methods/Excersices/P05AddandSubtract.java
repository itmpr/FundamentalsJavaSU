package Methods.Excersices;

import java.util.Scanner;

public class P05AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        subtractInt(n1+n2,n3);
    }

    public static int sumInteger(int num1, int num2){
        return num1 + num2;
    }

    public static void subtractInt(int num1, int num2){
        System.out.println(num1-num2);
    }
}
