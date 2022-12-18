package podstawowe.pakiet3;

public class KlasaGlowna {
    public static void main(String[] args) {
        //Z3
        int counter = 0;
        String name = "imie";

        while (counter < 5) {
            System.out.println(name);
            counter++;
        }

        //Z4
        int counter2 = 10;
        String text = "Dzisiaj jest czwartek";

        while (counter2 > 5) {
            System.out.println(text);
            counter2--;
        }

        //Z5
        String zmiennaTypuString;
        int zmiennaTypuInt = 125;
        System.out.println(zmiennaTypuInt);

        //Z6
        int liczbaKoszul = 3;
        if (liczbaKoszul == 5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        liczbaKoszul = 5;
        if (liczbaKoszul == 5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Z7
        String imie = "Ala";
        int liczbaKotow = 4;
        System.out.println(imie + " ma " + liczbaKotow + " koty.");
        imie = "Olga";
        System.out.println(imie + " ma " + liczbaKotow + " koty.");

        //Z8
        int counter3 = 6;
        while (counter3 >= 3) {
            System.out.println(counter3);
            counter3--;
        }

        //Z9
       for (int i = 6; i >= 3; i--) {
            System.out.println(i);
        }

       //Z10
        for (int liczbaKaw = 3; liczbaKaw > 0; liczbaKaw--) {
            System.out.println("Ala kupiła " + liczbaKaw + " kawy.");
        }

        //Z11
        String characterEnding = "y.";
        for (int liczbaKaw = 3; liczbaKaw > 0; liczbaKaw--) {
            if (liczbaKaw == 1) {
                characterEnding = "ę.";
            }
            System.out.println("Ala kupiła " + liczbaKaw + " kaw" + characterEnding);
        }

        //Z12
        String characterEnding2 = "y.";
        for (int liczbaKaw = 3; liczbaKaw > 0;) {
            if (liczbaKaw == 1) {
                characterEnding2 = "ę.";
            }
            System.out.println("Ala kupiła " + liczbaKaw + " kaw" + characterEnding2);
            liczbaKaw--;
        }

        //Z13
        String characterEnding3 = "y.";
        int liczbaKaw = 3;
        for (; liczbaKaw > 0;) {
            if (liczbaKaw == 1) {
                characterEnding3 = "ę.";
            }
            System.out.println("Ala kupiła " + liczbaKaw + " kaw" + characterEnding3);
            liczbaKaw--;
        }

        //Z14
        int liczba = 1;
        switch (liczba) {
            case 1:
                System.out.println("dziękuję");
                break;
            case 2:
                System.out.println("Miłego dnia");
                break;
            case 3:
                System.out.println("ok");
                break;
            default:
                System.out.println("Do widzenia");
        }

        //Z15
        int liczbaKotow2 = 4;
        if (liczbaKotow2 == 3) {
            System.out.println("Ala ma " + 3 + " koty.");
        } else {
            System.out.println("Ala ma za dużo kotów");
        }
    }
}
