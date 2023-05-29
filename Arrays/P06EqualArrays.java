package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondArr = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        int diffIndex = -1; // not valid number of index
        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];

            if (firstNum == secondNum){
                sum += firstNum;
            }else {
                diffIndex = i;
                break;
            }
        }
        if (diffIndex == -1){
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);

        }
    }
}
