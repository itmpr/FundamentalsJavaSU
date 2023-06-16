package Methods.Excersices;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //method to print middle element
        printMiddleCaracters(text);
    }

    public static void printMiddleCaracters(String txt){
        int length = txt.length();
        if (length % 2 != 0) {
            // print one element
            //"aString" -> ['a', 'S', 't', 'r', 'i', 'n', 'g']

            int indexOfMiddleCharacter = length/2;
            System.out.println(txt.charAt(indexOfMiddleCharacter));
        }else {
            //2 element
            //"Twentymile"->ty (5,6)
            int indexOfFirstMiddleCharacter = length/2 -1;
            int indexOfSecondMiddleCharacter =length/2;
            System.out.print(txt.charAt(indexOfFirstMiddleCharacter));
            System.out.print(txt.charAt(indexOfSecondMiddleCharacter));
        }
    }
}
