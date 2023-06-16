package Methods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = printString(str, n);
        System.out.println(result);
    }

    public static String printString(String text, int count){
        String res = "";
        for (int i = 1; i <= count ; i++) {
           res += text;
        }
        return res;
    }
}
