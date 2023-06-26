package ClassAndObject;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split(" ");
        Random randomObj = new Random();


        for (int j = 0; j < wordArr.length; j++) {
            int rndIndexX = randomObj.nextInt(wordArr.length);
            int rndIndexY = randomObj.nextInt(wordArr.length);

            String oldWord = wordArr[rndIndexX];
            wordArr[rndIndexX] = wordArr[rndIndexY];
            wordArr[rndIndexY] = oldWord;

        }
        System.out.println(String.join(System.lineSeparator(),wordArr));
    }
}
