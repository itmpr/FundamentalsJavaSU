package Arrays.Excercises;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input data
        String[] array = scanner.nextLine()
                .split(" "); // ["51" "47" "32" "61" "21"]
        int countRotation = Integer.parseInt(scanner.nextLine());
        for (int rotation = 0; rotation <= countRotation ; rotation++) {
            //1. rotation of array
            String firstElement = array[0]; //51

            //2. move elements to left
            // ["51" "47" "32" "61" "21"] -> ["47" "32" "61" "21" "21"]
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index+1];
            }
            //3. set element
            // ["47" "32" "61" "21" "51"]
            array[array.length - 1] = firstElement;
        }

        // finish with rotations -> print array's elements
        for (String element: array) {
            System.out.print(element + " ");
        }
    }
}
