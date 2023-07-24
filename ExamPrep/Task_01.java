package ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encrtprMsg = scanner.nextLine();
        StringBuilder modifyMsg = new StringBuilder(encrtprMsg);

        String command = scanner.nextLine();
        while (!command.equals("Decode")){
            if (command.contains("Move")){
                //Move|5 -> Dessislava :
                int countLetter = Integer.parseInt(command.split("\\|")[1]);
                String firstLetter = modifyMsg.substring(0,countLetter);//Desis
                modifyMsg.delete(0,countLetter);//lava
                modifyMsg.append(firstLetter);//lavaDesis

            } else if (command.contains("Insert")) {
                //Insert|2|o
                int index = Integer.parseInt(command.split("\\|")[1]);
                String textToInsert = command.split("\\|")[2];
                modifyMsg.insert(index,textToInsert);

            }else if (command.contains("ChangeAll")){
                //ChangeAll|ab|vr
                String textForChange = command.split("\\|")[1];
                String replace = command.split("\\|")[2];

                String currMsg = modifyMsg.toString();
                currMsg = currMsg.replace(textForChange,replace);
                modifyMsg = new StringBuilder(currMsg);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+modifyMsg);
    }

    public static class Task03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    // 1. Part
            Map<String, Integer> heroesHP = new LinkedHashMap<>();
            Map<String, Integer> heroesMP = new LinkedHashMap<>();

            int countHeroes = Integer.parseInt(scanner.nextLine());
            for (int hero = 1; hero <= countHeroes; hero++) {
                String heroInfo = scanner.nextLine();
                String[] heroData = heroInfo.split("\\s+");
                String heroName = heroData[0];
                int hp = Integer.parseInt(heroData[1]);
                int mp = Integer.parseInt(heroData[2]);

                if (hp <= 100) {
                    heroesHP.put(heroName, hp);
                }

                if (mp <= 200) {
                    heroesMP.put(heroName, mp);
                }
            }
    //2. Part - Game RUN
            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String[] commandParts = command.split("\\s+-\\s+");
                String commandName = commandParts[0];
                String heroName = commandParts[1];
                switch (commandName) {
                    case "CastSpell":
                        //CastSpell - Kyrre - 15 - ViewEarth
                        int mpNeeded = Integer.parseInt(commandParts[2]);
                        String spellName = commandParts[3];
                        int currMP = heroesMP.get(heroName);

                        //If the hero has the required MP
                        if (currMP >= mpNeeded) {
                            int mpLeft = currMP - mpNeeded;
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n" +
                                    "left} MP!", heroName, spellName, mpLeft);
                        }
                        //If the hero is unable to cast the spell
                        else {
                            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                        }
                        break;
                    case "TakeDamage":
                        //TakeDamage - Kyrre - 66 - Orc
                        int damage = Integer.parseInt(commandParts[2]);
                        String attacker = commandParts[3];
                        int currHP = heroesHP.get(heroName);
                        currHP -= damage;
                        if (currHP > 0) {
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currHP);
                            heroesHP.put(heroName, currHP);
                        } else {
                            System.out.printf("%s  has been killed by %s!", heroName, attacker);
                            heroesHP.remove(heroName);
                            heroesMP.remove(heroName);
                        }
                        break;
                    case "Recharge":
                        //Recharge - Solmyr - 50
                        int amount = Integer.parseInt(commandParts[2]);
                        int currMPHero = heroesMP.get(heroName);
                        currMPHero += amount;
                        if (currMPHero > 200) {
                            currMPHero = 200;
                        }
                        System.out.printf("%s recharged for %d MP!", heroName, currMPHero - heroesMP.get(heroName));
                        heroesMP.put(heroName, currMPHero);
                        break;
                    case "Heal":
                        //Heal - Solmyr - 10
                        int amountHeal = Integer.parseInt(commandParts[2]);
                        int currHPHero = heroesHP.get(heroesHP);

                        currHPHero += amountHeal;
                        if (currHPHero > 100) {
                            currHPHero = 100;
                        }
                        System.out.printf("%s healed for %d HP!%n", heroName, currHPHero - heroesHP.get(heroName));
                        heroesHP.put(heroName, currHPHero);
                        break;
                }
                command = scanner.nextLine();
            }
/*
            heroesHP.entrySet()
                    .forEach(entry-> {
                        String heroName = entry.getKey();
                        System.out.println(heroName);
                        System.out.println("HP: "+ entry.getValue());
                        System.out.println("MP: "+ heroesMP.get(entry.getKey());
                    });
*/

        }
    }
}
