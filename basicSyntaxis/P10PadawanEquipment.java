package basicSyntaxis;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float amountMoney = Float.parseFloat(scanner.nextLine());
        int countStudent = Integer.parseInt(scanner.nextLine());
        float priceLightsaber = Float.parseFloat(scanner.nextLine());
        float priceRobes = Float.parseFloat(scanner.nextLine());
        float priceBelts = Float.parseFloat(scanner.nextLine());

        int freeAmountBelts = 0;
        double amountLightSabers = Math.ceil(countStudent + countStudent * 0.1); //math.ceil
        int amountLS = (int)(amountLightSabers);
        if (countStudent > 5) {
            freeAmountBelts = countStudent / 6;
        }
        float sumLights = priceLightsaber * amountLS;
        float sumRobes = priceRobes * countStudent;
        float sumBelts = priceBelts * (countStudent - freeAmountBelts);
        float totalPrice = sumBelts + sumLights + sumRobes;
        float diff = Math.abs(amountMoney - totalPrice);


        if (totalPrice <= amountMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }
    }
}
