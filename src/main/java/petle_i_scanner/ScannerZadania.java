package petle_i_scanner;

import java.util.Scanner;

public class ScannerZadania {
    public static void main(String[] args) {

        //Scanner imie i nazwisko
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko: ");
        String s = scanner.nextLine();
        System.out.print("Hello " + s);
        //Scanner sumowanie integerów
        System.out.println("Podaj liczbę:");
        int i = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int j = scanner.nextInt();
        System.out.printf("%d + %d = %d", i, j, i+j);
        //Scanner pole czegoś tam przy użyciu double
        System.out.println("Podaj radius (double):");
        double num = scanner.nextDouble();
        System.out.printf("Area: %.2f",2 * Math.PI * num);

        //Scanner sprawdzający czy wpisana liczba jest parzysta czy nie
        System.out.println("Podaj liczbę:");
        int evenOrOddNum = scanner.nextInt();
        if (evenOrOddNum % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        //Scanner w pętli do wpisywania i wyświetlania 5 imion
        int n = 0;
        String[] names = new String[5];
        while (n < names.length) {
            System.out.println("Enter the name: ");
            names[n] = scanner.next();
            n++;
        }
        for (String name : names) {
            System.out.println("Hello " + name);
        }

        //Scanner wypisujący n-podanych elementów od 1.
        System.out.println("How many elements?");
        int[] numArray = new int[scanner.nextInt()];
        for (int g = 0; g < numArray.length; g++) {
            numArray[g] = g+1;
        }
        int g = 0;
        while (g < numArray.length) {
            System.out.println(numArray[g]);
            g++;
        }

        //Scanner przyjmujący 10 integerów od usera i wyświetlający je razem z indeksami tablicy
        int[] integers = new int[10];
        for (int h = 0; h < integers.length; h++) {
            System.out.println("enter the number:");
            integers[h] = scanner.nextInt();
        }
        for (int h = 0; h < integers.length; h++) {
            System.out.printf("tab[%d] = %d\n", h, integers[h]);
        }

    }
}
