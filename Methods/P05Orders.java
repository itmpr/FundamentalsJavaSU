package Methods;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (drink){
            case "coffee":
                price = 1.50;
                printOrder(price, quantity);
                break;
            case "water":
                price = 1;
                printOrder(price, quantity);
                break;
            case "coke":
                price = 1.40;
                printOrder(price, quantity);
                break;
            case "snacks":
                price = 2;
                printOrder(price, quantity);
                break;
        }

    }
    public static void printOrder(double price,int number){
        double result = price * number;
        System.out.printf("%.2f",result);
    }
}
