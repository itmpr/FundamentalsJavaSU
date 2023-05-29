package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*        int[] numArr = new int[5];
        int currNum = 0;
        for(int i = 0; i<numArr.length; i++) {
            currNum += 10;
            numArr[i] = currNum;
        }
        System.out.println();*/

/*
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
    }
*/
/*        // 2 8 30 25 40 75 -2 44 56
        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");
        int[] numArr = new int[inputArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }*/
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        //int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //mapToInt(e -> Integer.parseInt(e).toArray();}
        int[] numArr = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray(); //mapToInt(e -> Integer.parseInt(e).toArray();}
        //foreach examples
        // foreach is read-only
        for (int i:
             numArr) {
            System.out.println(i);
        }
        //----------------------------------------
        String[] arr = scanner.nextLine().split(" ");
        for(String el: arr){
            System.out.println(el);
        }



    }
}
