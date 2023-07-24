package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b(?<firstName>[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text); // {"Ivan Ivanov", "Georgi Georgiev"}
        while (matcher.find()){
            System.out.println("First name: "+matcher.group("firstName"));
            System.out.println("Last name: "+matcher.group("lastName"));
        }
    }
}
