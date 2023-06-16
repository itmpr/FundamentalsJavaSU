package Methods.Excersices;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            //check it for top integer
            boolean isValidSumDigits = checkSumDigitsIsDivide8(number);
            //sum/8 amd contains one or more odd digit
            boolean isContainsOddDigit = chechContainsOddDigit(number);
            if (isValidSumDigits && isContainsOddDigit) {
                //top integer
                System.out.println(number);
            }
        }

    }

    public static boolean checkSumDigitsIsDivide8(int number) {
        // calculate sum of digits
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10; //last digit
            sum += lastDigit;
            number = number / 10; // remove last digit from number
        }
        //2. check if sum / 8 ?
        return sum % 8 == 0;
    }

    //method check digit if it is odd
    public static boolean chechContainsOddDigit(int number){
        //3657
        while (number>0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                // digit is odd
                return true;
            }else {
                number /= 10;
            }
        }
        // there are not any digit chetna
        return false;
    }
}
