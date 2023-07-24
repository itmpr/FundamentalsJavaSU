package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String allDestinations = scanner.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(allDestinations);

        List<String> validDestination = new ArrayList<>();
        while (matcher.find()){
            String destination = matcher.group("destination");
            validDestination.add(destination);
        }
        System.out.println("Destinations: " + String.join(", ", validDestination));

        int travelPoint = 0;
        for(String dest: validDestination){
            travelPoint += dest.length();
        }

        System.out.println("Travel Points: " + travelPoint);
    }
}
