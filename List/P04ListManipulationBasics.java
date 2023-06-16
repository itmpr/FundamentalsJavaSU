package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("end")){
            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command){
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int insertIndex = Integer.parseInt(commandArr[2]);
                    numList.add(insertIndex,numToInsert);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
    }
}
