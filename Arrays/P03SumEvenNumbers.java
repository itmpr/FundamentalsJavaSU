package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //1 2 3 4 5 6
        int[] numArr = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
/*        String[] inputArr = input.split(" ");
        //int[] numArr = new int[scanner.nextLine().split(" ").length]; // not proper
        int[] numArr = new int[inputArr.length];
        for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
        }
*/

        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currNum = numArr[i];
            if(currNum % 2 == 0){
                sum += currNum;
            }
        }
        System.out.println(sum);
    }
}
