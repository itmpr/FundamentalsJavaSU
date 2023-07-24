package RegEX;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P0StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackersPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int msgCount = 1; msgCount <= n; msgCount++) {
            String encryptedMsg = scanner.nextLine();
            String decryptedMsg = getDecryptedMsg(encryptedMsg);
            Matcher matcher = pattern.matcher(decryptedMsg);
            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")){
                    attackersPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planetName);
                }
            }
        }

        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets);
        attackersPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    public static String getDecryptedMsg(String encryptedMsg) {
        int countLetters = getSpecialLettersCount(encryptedMsg);
        StringBuffer decryptedMsg = new StringBuffer();
        for(char symbol: encryptedMsg.toCharArray()){
            char newSymbol = (char)(symbol - countLetters);
            decryptedMsg.append(newSymbol);
        }
        return decryptedMsg.toString();
    }

    public static int getSpecialLettersCount(String encryptedMsg){
        int count = 0;
        for(char symbol : encryptedMsg.toCharArray()){
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case'S':
                case'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}
