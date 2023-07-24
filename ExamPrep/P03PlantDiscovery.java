package ExamPrep;

import java.util.Scanner;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        String inputLine = scanner.nextLine();
        while(!inputLine.equals("Exhibition")){
            String[] tokens = inputLine.split("[: -]+");
            String comm = tokens[0];
            String plant = tokens[1];

            boolean isValidComm = comm.equals("Rate") || comm.equals("Update") || comm.equals("Reset");

            if (true) {
                System.out.println("error");
            } else {
                switch (comm) {
                    case "Rate":
                }
            }

        }

    }
}
