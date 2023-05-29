package Arrays.Excercises;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] peopleWagon = new int [wagons];
        int sum = 0;
        for (int i = 0; i < wagons ; i++) {
            peopleWagon[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(peopleWagon[i] + " ");
            sum += peopleWagon[i];
        }
        System.out.printf("%n%d",sum);
    }
}
