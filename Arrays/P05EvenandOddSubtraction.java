package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // 1 2 3 4 5 6

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currNum = numArr[i];

            if (currNum % 2 == 0){
                evenSum += currNum;
            }else {
                oddSum += currNum;
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
