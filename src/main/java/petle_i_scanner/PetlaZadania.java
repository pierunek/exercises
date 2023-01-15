package petle_i_scanner;

public class PetlaZadania {

    public static void main(String[] args) {
        int counterOfExercises = 0;
        //Zadanie 1
        separator(++counterOfExercises);
        for (int i = 0; i < 20; i++) {
            System.out.print(i + "\t");
        }

        //Zadanie 2
        separator(++counterOfExercises);
        for (int i = 0; i < 20; i++) {
            System.out.println("liczba nr " + i);
        }

        //Zadanie 3
        separator(++counterOfExercises);
        for (int i = 20; i > 0; i--) {
            System.out.print(i + "\t");
        }

        //Zadanie 4
        separator(++counterOfExercises);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "\t");
            }
        }

        //Zadanie 5
        separator(++counterOfExercises);
        for (int i = 100; i < 120; i++) {
            if (i % 3 == 1) {
                System.out.println(i);
            }
        }

        //Zadanie 6
        separator(++counterOfExercises);
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += i;
        }
        System.out.println("Suma wynosi: " + sum);

        //Zadanie 7
        separator(++counterOfExercises);
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        if (sumOdd > sumEven) {
            System.out.println("Wyższy wynik ma suma nieparzystych: " + sumOdd);
        } else {
            System.out.println("Wyższy wynik ma suma parzystych: " + sumEven);
        }

        //Zadanie 8
        separator(++counterOfExercises);
        int result = 0;
        int counter = 0;

        while (result <= 1000) {
            result += counter;
            counter++;
        }
        System.out.println("Aby przekroczyć 1000 należy zsumować kolejnych " + counter + " liczb.");

        //Zadanie 9
        separator(++counterOfExercises);
        int sumaParzyste = 0;
        int sumaNieparzyste = 0;
        int parzysteCounter = 0;
        int nieparzysteCounter = 0;
        int globalCounter = 0;

        while (sumaParzyste <= 1000) {
            if (globalCounter % 2 ==0) {
       //         System.out.println(parzysteCounter + 1 + ". suma parzyste " + sumaParzyste + " plus " + globalCounter + " wynosi " + (sumaParzyste + globalCounter));
                sumaParzyste += globalCounter;
                parzysteCounter++;
            }
            globalCounter++;
        }
        globalCounter = 0;
        while (sumaNieparzyste <= 1000) {
            if (globalCounter % 2 !=0) {
       //         System.out.println(nieparzysteCounter + 1 + ". suma nie " + sumaNieparzyste + " plus " + globalCounter + " wynosi " + (sumaNieparzyste + globalCounter));
                sumaNieparzyste += globalCounter;
                nieparzysteCounter++;
            }
            globalCounter++;
        }
        System.out.printf("Nieparzyste %d, Parzyste %d\n", nieparzysteCounter, parzysteCounter);

        //Zadanie 10
        separator(++counterOfExercises);
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }

    }

    private static void separator(int numOfExercise) {
        String line = "========================================";
        System.out.println("\n" + line + "> ZADANIE " + numOfExercise + " <" + line);
    }

}
