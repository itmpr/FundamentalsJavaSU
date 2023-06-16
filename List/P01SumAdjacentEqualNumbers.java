package List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        //3 3 6 1 -> 6 6 1
        for (int i = 0; i < nums.size() - 1; i++) {
            double currNum = nums.get(i);
            double nextNum = nums.get(i + 1);

            if (currNum == nextNum) {
                double sum = currNum + nextNum;
                nums.set(i, sum);
                nums.remove(i + 1);
                i -= 1;
            }
        }
        System.out.println(joinElemntByDelimiter(" ", nums));
    }

    public static String joinElemntByDelimiter(String delimiter, List<Double> list) {
        DecimalFormat df = new DecimalFormat("0.#");

        String result = "";
        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }

}
