package DataTypeandVariables;
import java.util.Scanner;
public class P302SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (number > 0) {
            int currNum = number % 10;
            sum += currNum;
            number /= 10;

        }
        System.out.println(sum);
    }
}
