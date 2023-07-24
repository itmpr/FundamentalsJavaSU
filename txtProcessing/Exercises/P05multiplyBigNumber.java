package txtProcessing.Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class P05multiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        BigInteger firstNumber = new BigInteger(firstInput);
        int secondNumber = Byte.parseByte(secondInput);

        System.out.println(firstNumber.multiply(new BigInteger(secondNumber+"")));

    }
}
