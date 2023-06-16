package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordList = new ArrayList<>(Arrays.asList("Maria", "George", "Veronika"));
        wordList.remove("Maria");

        System.out.println();


        List<Integer> numList = new ArrayList<>(Arrays.asList(10, 20, 30, 40 ,50));

        // remove element 10
        numList.remove(0);

        numList.remove(Integer.valueOf(20));

        if (!wordList.contains("Maria")){
            wordList.add("Maria");
            wordList.add("Maria");
            wordList.add("Maria");
        }
        wordList.remove("Maria");


    }
}
