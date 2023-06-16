package Methods;

import java.util.Objects;
import java.util.Scanner;

public class P09GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        switch (type){
            case "string":
                String s1 =  scanner.nextLine();
                String s2 =  scanner.nextLine();
                System.out.println(getMax(s1,s2));
                break;
            case "int":
                int num1 =  Integer.parseInt(scanner.nextLine());
                int num2 =  Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case "char":
                String c1 = scanner.nextLine();
                String c2 = scanner.nextLine();
                System.out.println(getMax(c1,c2));
                break;
        }


    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
    public static String getMax(String first, String second) {
        if (first.compareTo(second)==0) {
            return first;
        } else {
            return second;
        }
    } public static char getMax(char first, char second) {
        if (first>second) {
            return first;
        } else {
            return second;
        }
    }
}
