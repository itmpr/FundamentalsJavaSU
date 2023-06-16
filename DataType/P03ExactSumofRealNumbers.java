package DataType;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int j = 0; j < n ; j++) {
            BigDecimal cuurentNum = new BigDecimal(scanner.nextLine());

            sum = sum.add(cuurentNum);

        }
        System.out.println(sum);
    }
}
