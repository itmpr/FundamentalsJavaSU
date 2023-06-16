package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numberList = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //1 2 3 4 5 -> 6 2 3 4 -> 6 6 3
        int sizeList = numberList.size();
        for (int i = 0; i < sizeList/2; i++) {
            int firstNum = numberList.get(i);
            int secondNum = numberList.get(numberList.size() - 1);

            int sum = firstNum + secondNum;
            numberList.set(i, sum);
            numberList.remove(numberList.size() - 1);

        }
        for(int item : numberList){
            System.out.print(item + " ");
        }
    }
}
