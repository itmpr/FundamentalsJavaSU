package Methods.Excersices;

import java.util.Scanner;

public class P03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbolsinRange(firstSymbol,secondSymbol);
    }

    public static void printSymbolsinRange(char firstSymbol, char secondSymbol) {

        if (firstSymbol<secondSymbol){
            //start from firstSymbol -> end secondSymbol
            for (char symbol = (char)(firstSymbol + 1); symbol <secondSymbol ; symbol++) {
                System.out.print(symbol + " ");
            }
        }else {
            //start from secondSymbol -> end firstSymbol
            for (char symbol = (char)(secondSymbol+1); symbol <firstSymbol ; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
