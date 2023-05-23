import java.util.Scanner;

public class P06Orders {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double totalPrice = 0;
    int N = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < N+1; i++) {
            double sum = 0;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int  daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            sum = daysInMonth * capsuleCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",sum);
            totalPrice += sum;

        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
