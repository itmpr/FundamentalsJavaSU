import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        double countStudent = Double.parseDouble(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double freeAmountBelts = 0;
        double amountLightSabers = Math.ceil(countStudent * 1.1); //10%lightBers
        if(countStudent > 5){
            freeAmountBelts = countStudent / 6;
        }
        double totalSumLghts = priceLight * amountLightSabers;
        
    }
}
