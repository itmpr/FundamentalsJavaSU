package List.Excersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equals("End")) {
            String[] cmdParts = cmd.split(" "); // ["Add", "{numbers}"]
            String cmdName = cmdParts[0]; // "Add", "Insert", "Remove", "Shift"
            switch (cmdName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(cmdParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(cmdParts[1]);
                    int indexForInsert = Integer.parseInt(cmdParts[2]);
                    if (isValidIndex(indexForInsert, numbers.size())) {
                        numbers.add(indexForInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(cmdParts[1]);
                    if (isValidIndex(indexToRemove, numbers.size())) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = cmdParts[1]; // direction "left ""right"
                    int countTime = Integer.parseInt(cmdParts[2]);
                    if (direction.equals("left")) {
                        for (int i = 1; i <= countTime; i++) {
                            int firstElement = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstElement);
                        }
                    } else if (direction.equals("right")) {
                        for (int i = 1; i <= countTime; i++) {
                            int lastElement = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastElement);
                        }
                    }
                    break;
            }
            cmd = scanner.nextLine();
        }
        for(int element: numbers){
            System.out.print(element + " ");
        }
    }
    public static boolean isValidIndex(int index, int size){
        return   index >= 0 && index <= size - 1;
    }
}
