package MidExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Go shopping!")){
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            String item = commandArr[1];
            switch(command) {
                case "Urgent":
                    if (!productList.contains(item)) {
                        productList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    productList.remove(item);
                    break;

                    case "Correct":
                        String newItem = commandArr[2];
                        if (productList.contains(item)){

                        }
                    break;
                case "":
                    break;





            }
        }

    }
}
