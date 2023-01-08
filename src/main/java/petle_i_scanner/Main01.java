package petle_i_scanner;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        //ile kolejnych liczb trzeba zsumować do 1000
        int result = 0;
        int counter = 0;

        while (result < 1000) {
            result += counter;
            counter++;
        }
        System.out.println("ilość kolejnych liczb do zsumowaia: " + counter);

        separator();

        //to co wyżej ale dla parzystych i nieparzystych
        int sumaParzyste = 0;
        int sumaNieparzyste = 0;
        int parzysteCounter = 0;
        int nieparzysteCounter = 0;
        int globalCounter = 0;

        while (sumaParzyste < 1000 && sumaNieparzyste < 1000) {
            if (globalCounter % 2 ==0) {
//                System.out.printf("sumaParzyste %d add %d result %d\n", sumaParzyste, globalCounter, sumaParzyste + globalCounter);
                sumaParzyste+=globalCounter;
                parzysteCounter++;
            } else {
//                System.out.printf("sumaNieparzyste %d add %d result %d\n", sumaNieparzyste, globalCounter, sumaNieparzyste + globalCounter);
                sumaNieparzyste+=globalCounter;
                nieparzysteCounter++;
            }
            globalCounter++;
        }
        System.out.printf("Nieparzyste %d, Parzyste %d\n", nieparzysteCounter, parzysteCounter);

        separator();

        //100 kolejnych liczb po 4 w wierszu
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.println();
            }
                System.out.print(i + "\t");
        }

        separator();

        //Scanner imie i nazwisko
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko: ");
        String s = scanner.nextLine();
        System.out.print("Hello " + s);

        separator();

        //Scanner sumowanie integerów
        System.out.println("Podaj liczbę:");
        int i = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int j = scanner.nextInt();
        System.out.printf("%d + %d = %d", i, j, i+j);

        separator();

        //Scanner pole czegoś tam przy użyciu double
        System.out.println("Podaj radius (double):");
        double num = scanner.nextDouble();
        System.out.printf("Area: %.2f",2 * Math.PI * num);

        separator();

        //Scanner sprawdzający czy wpisana liczba jest parzysta czy nie
        System.out.println("Podaj liczbę:");
        int evenOrOddNum = scanner.nextInt();
        if (evenOrOddNum % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        separator();

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

        separator();

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

        separator();

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

    private static void separator() {
        System.out.println("\n===========================================");
    }

}
