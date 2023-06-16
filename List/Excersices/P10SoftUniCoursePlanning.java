package List.Excersices;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> topics = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String cmd = scanner.nextLine();
        while (!cmd.equals("course start")) {
            String[] cmdParts = cmd.split(":");// cmd = "Add:{lessonTitle}.split(":")
            String commName = cmdParts[0];
            String topic = cmdParts[1];
            switch (commName) {
                case "Add":
                    if (!topics.contains(topic)) {
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    //"Insert:Database:3"
                    int index = Integer.parseInt(cmdParts[2]);
                    if (!topics.contains(topic)) {
                        topics.add(index, topic);
                    }
                    break;
                case "Remove":
                    //Databases, Databases-Exercise, List, Array
                    //"Remove:Databases"
                    if (topics.contains(topic)) {
                        int indexTopic = topics.indexOf(topic);
                        String exercise = topic + "-Exercise";
                        boolean hasExercise = indexTopic != topics.size() - 1 && topics.get(indexTopic + 1).equals(exercise);
                        //true -> has exercise to topic
                        topics.remove(topic);
                        if (hasExercise) {
                            topics.remove(exercise);
                        }
                    }
                    break;
                case "Swap":
                    //"Swap:Arrays:Methods"
                    String topic2 = cmdParts[2];
                    if (topics.contains(topic) && topics.contains(topic2)) {
                        int indexFirst = topics.indexOf(topic);//0
                        int indexSecond = topics.indexOf(topic2);//2

                        topics.set(indexFirst, topic2);// {Methods, Lists, Methods}
                        topics.set(indexSecond, topic);//{Metods,Lists, Arrays}

                        //swaps exercises
                        String exFirst = topic + "-Exercise"; // exercise for first topic
                        String exSecond = topic2 + "-Exercise";

                        if (topics.contains(exFirst)) {
                            topics.remove(exFirst);
                            topics.add(topics.indexOf(topic) + 1, exFirst);
                        }

                        if (topics.contains(exSecond)) {
                            topics.remove(exSecond);
                            topics.add(topics.indexOf(topic2) + 1, exSecond);
                        }
                    }
                    break;
                case "Exercise":
                    String exerciseName = topic + "-Exercise";
                    // Exercise:Lists
                    //{Arrays, Lists, Lists-Exercise, Methods}

                    if (topics.contains(topic)) {
                        int indexTopicc = topic.indexOf(topic);
                        if (indexTopicc == topics.size() - 1) {
                            //there is not exercise
                            topics.add(indexTopicc + 1, exerciseName);
                        } else if (!topics.get(indexTopicc + 1).equals(exerciseName)) {
                            topics.add(indexTopicc + 1, exerciseName);
                        }
                    } else {
                        topics.add(topic);
                        topics.add(exerciseName);

                    }
                    break;
            }


            cmd = scanner.nextLine();
        }

        // list with topics
        //number. topics
        int count = 1;
        for (String topic : topics) {
            System.out.println(count + "." + topic);
            count++;
        }
    }
}
