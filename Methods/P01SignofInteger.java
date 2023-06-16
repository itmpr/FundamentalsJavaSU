package Methods;

import java.util.Scanner;

public class P01SignofInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printSignInteger(number);

    }
    public static void printSignInteger(int num){
        if (num >0){
            System.out.printf("The number %d is positive.",num);
        }else if (num<0){
            System.out.printf("The number %d is negative.",num);
        }else{
            System.out.printf("The number %d is zero.", num);
        }
    }
}
