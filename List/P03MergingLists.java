package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            int numfirstList = firstList.get(i);
            int numsecondList = secondList.get(i);

            resultList.add(numfirstList);
            resultList.add(numsecondList);
        }

        //List<Integer> subList = firstList.subList(0,3);


        if (firstList.size()>secondList.size()){
            List<Integer> subList = firstList.subList(minSize,firstList.size());

            resultList.addAll(subList);
        } else if (secondList.size()>firstList.size()){
            List<Integer> subList = secondList.subList(minSize, secondList.size());

            resultList.addAll(subList);
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
    }
}
