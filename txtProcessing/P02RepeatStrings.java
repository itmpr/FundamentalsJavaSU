package txtProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordArr = scanner.nextLine().split(" ");

        //hi abc add -> hihiabcabcabcaddaddadd

        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < wordArr.length; i++) {
            String currentWord = wordArr[i];
            String repeatWord = repeatString(currentWord);
            resultList.add(repeatWord);
        }
        System.out.println(String.join("",resultList));


    }
    public static String repeatString(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word;
        }
        return result;
    }
}
