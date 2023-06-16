package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double pow = Double.parseDouble(scanner.nextLine());

        double result = mathPower(num, pow);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
    public static double mathPower(double number, double power){
        double result = 1;
        for (int i =1 ; i <= power ; i++) {
            result *= number;
        }
        return result;
    }
}
