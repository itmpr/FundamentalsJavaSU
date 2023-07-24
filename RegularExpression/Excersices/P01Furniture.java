package RegularExpression.Excersices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;

        String input = scanner.nextLine();

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                double currPrice = price * quantity;
                totalPrice += currPrice;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
