package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("%d.%s%n");

        }
    }
}
