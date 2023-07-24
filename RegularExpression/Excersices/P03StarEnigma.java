package RegularExpression.Excersices;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P03StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<>
        for (int messCount = 1; messCount <= n; messCount++) {


        }
    }
}
