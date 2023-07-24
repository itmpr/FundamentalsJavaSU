package MidExamples;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalBonus = 0;

        int countStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countStudent ; i++) {
            int countLectures = Integer.parseInt(scanner.nextLine());
            int additionalBonusPerCourse = Integer.parseInt(scanner.nextLine());
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            int currTotalBonus = studentAttendances / countLectures * (5 + additionalBonusPerCourse);

            System.out.println(currTotalBonus);


        }
        System.out.println();
    }
}
