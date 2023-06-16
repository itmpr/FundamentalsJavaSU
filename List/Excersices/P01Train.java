package List.Excersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxSeats = Integer.parseInt(scanner.nextLine());
        String cmd = scanner.nextLine();
        while (!cmd.equals("end")) {
            String[] cmdParts = cmd.split(" "); // ["Add", "{numbers}"]
            String cmdName = cmdParts[0]; // "Add"

            if(cmdName.equals("Add")){
                //add passangers
                int numberToAdd = Integer.parseInt(cmdParts[1]);
                wagons.add(wagons.size()-1,numberToAdd);
            } else {
                int passengers = Integer.parseInt(cmdParts[0]);
                for (int i = 0; i < wagons.size() ; i++) {
                    int currElement = wagons.get(i);
                    if((wagons.get(i)+currElement) <= maxSeats){
                        wagons.add(i,currElement+passengers);
                    }

                }

            }
        }

        for(int wagonSeats: wagons){
            System.out.println(wagonSeats);
        }


    }
}
