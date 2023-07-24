package txtProcessing;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {
            String asterik = repeateString(banWord);
            text = text.replace(banWord, asterik);
        }

    }

    public static String repeateString(String banWord) {

        String result = "";
        for (int i = 0; i < banWord.length(); i++) {
            result = result + '*';
        }
        return result;
    }
}
