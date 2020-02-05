package app;

import java.util.Locale;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String[] nameTable = new String[5];

        System.out.println("Podaj 5 imion:");
        for(int i = 0; i < 5; i++){
            nameTable[i] = scanner.nextLine();
        }

        for(int i = 4; i >= 0 ; i--){
            System.out.println("Czesc - " + nameTable[i]);
        }

    }
}
