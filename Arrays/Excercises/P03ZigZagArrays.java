package Arrays.Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int index = 0; index < n ; index++) {
            int [] input = Arrays.stream(scanner.nextLine() // "1 4 3 2"
                            .split(" "))                // ["1" "4" "3" "2"]
                            .mapToInt(e -> Integer.parseInt(e))            // [1 4 3 2]
                            .toArray();

            if (index % 2 == 0) {
                firstArr[index] = input[0];
                secondArr[index] = input[1];
            } else {
                secondArr[index] = input[0];
                firstArr[index] = input[1];
            }
        }
        for (int i = 0; i < firstArr.length ; i++) {
            System.out.print(firstArr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length ; i++) {
            System.out.print(secondArr[i] + " ");

        }
    }
}
