package petle_i_scanner;

import java.util.Random;
import java.util.Scanner;

public class SaturdayScanner {

    public static void main(String[] args) {

        //Zadanie1
        Scanner scanner = new Scanner(System.in);
        String dzisiajJest = "Dzisiaj jest ";
        System.out.println("Wpisz liczbę: ");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(dzisiajJest + "poniedziałek");
                break;
            case 2:
                System.out.println(dzisiajJest + "wtorek");
                break;
            case 3:
                System.out.println(dzisiajJest + "środa");
                break;
            default:
                System.out.println("Nie ma takiego dnia tygodnia");
        }

        //Zadanie2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scanner2.next();
        for (int i = 0; i < 10; i++) {
            System.out.println(imie);
        }

        //Zadanie3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy: ");
        String[] arrOfNames = new String[scanner3.nextInt()];
        for (int i = 0; i < arrOfNames.length; i++) {
            System.out.println("Podaj imię: ");
            arrOfNames[i] = scanner3.next();
        }
        for (String name : arrOfNames) {
            System.out.println(name);
        }

        //Zadanie 4
        Scanner scanner4 = new Scanner(System.in);
        int[] digits = new int[10];
        for (int i = 0; i < digits.length; i++) {
            System.out.println("Podaj cyfrę: ");
            digits[i] = scanner4.nextInt();
        }
        for (int length = digits.length; length > 0; length--) {
            System.out.print(digits[length - 1] + "\t");
        }

        //Zadanie 5
        Pracownik pracownik = new Pracownik();
        Pracownik pracownik1 = new Pracownik();

        //Zadanie 6
        Scanner scanner6 = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj liczbę do zakresu: ");
        int num = scanner6.nextInt();
        int randomNum = random.nextInt(num + 1);
        System.out.println("Twoja randomowa liczba z przedziału 0-" + num + " to: " + randomNum);

        //Zadanie 7
        if (randomNum == 0) {
            System.out.println("WYGRAŁEŚ!");
        } else {
            System.out.println("PRZEGRAŁEŚ");
        }
        //Zadanie 8
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner8.next();
        System.out.println("Podaj liczbę kotów: ");
        int numOfCats = scanner8.nextInt();
        System.out.println(name + " ma " + numOfCats + " kotów.");

        //Zadanie 9
        Scanner scanner9 = new Scanner(System.in);
        int[] arrayOfNumbers = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println("Wprowadz liczbę: ");
            arrayOfNumbers[i] = scanner9.nextInt();
        }
        for (int number : arrayOfNumbers) {
            System.out.print(number + "\t");
        }

        //Zadanie 10
        int sumaParzyste = 0;
        int sumaNieparzyste = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sumaParzyste += i;
                continue;
            }
            sumaNieparzyste += i;
        }
        System.out.println("suma parzyste: " + sumaParzyste);
        System.out.println("suma nieparzyste: " + sumaNieparzyste);

    }

}
