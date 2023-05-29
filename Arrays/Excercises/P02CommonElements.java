package Arrays.Excercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firsRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArray = firsRow.split(" ");    //{ "Hey", "hello", "2", "4"}
        String[] secondArray = secondRow.split(" "); //{"10", "hey", "4", "hello"}

        // for each element from second array -> check it if present in first array
        for(String el2: secondArray){
            for (String el1: firstArray) {
                if (el2.equals(el1)){
                    System.out.print(el1 + " ");
                }

            }
        }
    }
}
