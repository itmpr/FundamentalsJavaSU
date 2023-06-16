package List.Excersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine() // "1 2 3 4"
                        .split(" "))                        //["1", "2", "3", "4"]
                        .map(Integer::parseInt)                   //[1, 2, 3, 4]
                        .collect(Collectors.toList());            //{1, 2, 3, 4}

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            // "Delete 5".split(" ") -> ["Delete", "5"]
            if (command.contains("Delete")) {
                int numRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numRemove));
            }
            // Insert 3 1
            else if (command.contains("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }
            command = scanner.nextLine();
        }
        // print List
        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }

}
