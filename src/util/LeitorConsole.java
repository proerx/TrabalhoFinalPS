package util;

import java.util.Scanner;

public class LeitorConsole {
    private static final Scanner scanner = new Scanner(System.in);

    public static int lerInt(String msg) {
        System.out.print(msg);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Valor inválido. " + msg);
        }
        return scanner.nextInt();
    }
}