package Arrays.Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class Po5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine() // "1 4 3 2"
                            .split(" "))            // ["1" "4" "3" "2"]
                            .mapToInt(Integer::parseInt) // [1 4 3 2]
                            .toArray();

        for (int index = 0; index < numbers.length -  1 ; index++) {
            //each elements without the last and check them for bigger
            int currNum = numbers[index];
            boolean isBigger = true; //true -> currNum bigger false-> not bigger
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int numberAfter = numbers[i];
                if (currNum <=numberAfter) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(currNum + " ");
            }

        }
        System.out.println(numbers[numbers.length - 1] + " ");
    }
}
