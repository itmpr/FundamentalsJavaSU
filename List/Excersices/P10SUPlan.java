/*
package List.Excersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P10SUPlan {
    Scanner scanner = new Scanner(System.in);
    List<String> topics = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

    String cmd = scanner.nextLine();

        while(!cmd.equals("course start")){
        List<String> Split = Arrays.stream(cmd.split(":")).collect(Collectors.toList());
        String cmdPart = Split.get(0);
        String lessonTitle = Split.get(1);

        switch(cmdPart){
            case"Add":
                if(!topics.contains(lessonTitle)){
                    topics.add(lessonTitle);
                }
                break;
            case"Insert":
                int Index = Integer.parseInt(Split.get(2));

                if(!topics.contains(lessonTitle)){
                    if(Index>=0 && Index< topics.size()) {
                        topics.add(Index, lessonTitle);
                    }
                }
                break;
            case"Remove":
                String exerciseTitle = Split.get(1)+"-Exercise";

                if(topics.contains(lessonTitle) && topics.contains(exerciseTitle)){
                    topics.remove(lessonTitle);
                    topics.remove(exerciseTitle);
                }
                if(topics.contains(lessonTitle)){
                    topics.remove(lessonTitle);
                }

                if(topics.contains(exerciseTitle)){
                    topics.remove(exerciseTitle);
                }

                break;
            case"Swap":
                String lessonTitle2 = Split.get(2);

                if(topics.contains(lessonTitle) && topics.contains(lessonTitle2)) {
                    int indexOfFirst = topics.indexOf(lessonTitle);
                    int indexOfSecond = topics.indexOf(lessonTitle2);

                    String tempValue = topics.get(indexOfFirst);

                    topics.set(indexOfFirst, lessonTitle2);
                    topics.set(indexOfSecond, tempValue);

                    if(topics.contains(lessonTitle+"-Exercise")){
                        String tempName = lessonTitle+"-Exercise";
                        topics.remove(lessonTitle + "-Exercise");

                        if(indexOfSecond+1<= topics.size()-1){
                            topics.add(indexOfSecond+1,tempName);
                        }else{
                            topics.add(tempName);
                        }
                    }

                    else if(topics.contains(lessonTitle2+"-Exercise")){
                        String tempName = lessonTitle2+"-Exercise";
                        topics.remove(lessonTitle2 + "-Exercise");

                        if(indexOfFirst+1<= topics.size()-1){
                            topics.add(indexOfFirst+1,tempName);
                        }else{
                            topics.add(tempName);
                        }
                    }
                }
                break;
            case"Exercise":
                String newValue = lessonTitle+"-Exercise";

                if (topics.contains(lessonTitle)) {
                    if (!topics.contains(lessonTitle + "-Exercise")) {
                        int indexOf = topics.indexOf(lessonTitle);
                        if (indexOf <= topics.size() - 1) {
                            topics.add(indexOf + 1, newValue);
                        } else {
                            topics.add(newValue);
                        }
                    }
                }
                else{
                    topics.add(lessonTitle);
                    topics.add(newValue);
                }
        }
        cmd = scanner.nextLine();
    }
    int count =0;
        for(int i=0;i<=topics.size()-1;i++){
        count++;
        System.out.printf("%s.%s\n",count, topics.get(i));
    }

}
*/
