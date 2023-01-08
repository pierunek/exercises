package zagadnienia;

public class Zagadnienia {
    public static void main(String[] args) {
        //byte, short, int, long - typy danych liczb całkowitych, różnią się pojemnością zakresu liczb
        //float, double - typ danych liczbowych zmiennoprzecinkowych, float bodajże do 6 miejsc po przecinku, double więcej
        //char - typ danych pojedyńczych znaków np. 'A', 'a', '2', '!' etc
        //boolean - typ danych prawda/fałsz
        //String - typ obiektowy, ciąg znaków

        //definiowanie zmiennych różnych typów przykłady
        byte malaLiczba = 2;
        short troszkeWieksza = 129;
        int liczba = 5000;
        long duzaLiczba = 1000000000;
        float zmiennoPrzecinkowa = 10.123456f; //należy na końcu dodać literkę f, gdyż w przeciwnym wypadku będzie traktowane jako double
        double zmiennoPrzecinkowaDuza = 10.12345678901234567890;
        boolean prawda = true; //przyjmuje wartość true lub false
        char wykrzyknik = '!'; //char przyjmuje apostrofy do definiowania znaków, String zaś cudzysłowa
        String text = "text!12345";

        int liczba1 = 1;
        int liczba2 = 2;
        int liczba3 = 1;
        //if działa jak JEŻELI w excelu, porównujemy jakiś condition i w zależności od tego czy jest spełniony czy też nie, wykonujemy podane czynności
         //&& - oznacza AND (excelowe ORAZ) czyli oba warunki muszą być true, w przeciwnym wypadku zwraca false
         //|| - oznacza OR (excelowe LUB) conajmniej jeden z warunków musi być true, jeżeli żaden nie jest spełniony to zwraca false
          if (liczba1 == liczba2 && liczba1 == liczba3) {
              System.out.println("są równe");
          } else if (liczba2 == liczba3 + liczba1) {
              System.out.println("są równe else if");
          } else {
              System.out.println("są nierówne");
          }

        int[] tablica = {12,22,3,52,13,7,55,2}; // Jest to 8-elementowa tablica zawierająca dane typu int,
        // pierwszy element zawsze ma indeks 0, więc numerami indeksów w tej tablicy są 0-7
        // wartość 12 w tym wypadku ma element o indeksie 0, wartość 52 ma element o indeksie 3 etc
        int[] tablica2 = new int[5]; // inna forma inicjalizacji tablicy, w nawiasie kwadratowym podajemy pojemność/wielkość/długość tablicy
        // w tym wypadku jest to tablica 5-elementowa, jej indeksy = 0-4
        // w tym przypadku nie definiujemy tablicy z wartościami, każdy element przyjmuje wartość 0 (defaultowa wartość inta)

        //wprowadzanie wartości do tablicy
        //należy dla poszczególnej tablicy w nawiasie kwadratowym podać indeks dla którego chcemy wprowadzić wartość
        //a następnie używając = podać w tym wypadku liczbę
        tablica[1] = 8;
        tablica2[2] = 7;
        tablica2[4] = 66;

//        tablica2[5] = 80; //w tym wypadku otrzymamy błąd ArrayOutOfBoundException, ponieważ deklarowaliśmy tablica2 o rozmiarze 5 elementów,
                            //indeksy w tablicach zaczynamy od 0, więc ta tablica ma indeksy w granicach od 0 do 4 [0,1,2,3,4] <- 5 elementów.
                            //nie możemy zatem zdefiniować elementu z indeksem 5 tej tablicy, ponieważ byłby to 6-sty element tablicy, czyli
                            //wykracza za ustalony rozmiar

        //wyświetlanie elementu o konkretnym indeksie z tablicy
        System.out.println(tablica[3]);
        //wyświetlanie pojemnosci/wielkości/długości tablicy
        System.out.println(tablica.length);

        //pętle for
        //budowa pętli for(deklaracja; warunek; inkrementacja/dekrementacja)
        //jako pierwszą podajemy zmienną, której deklarujemy wybraną przez nas wartość
        //następnie sprawdzamy czy nasza zadeklarowana zmienna spełnia warunek
        //jeżeli spełnia to wykonujemy kod zawarty w ciele pętli
        //na koniec odpowiednio zwiększami/zmniejszamy wartość zadeklarowanej przez nas zmiennej
        //wykonujemy dopóki warunek zwraca true

        //Przydatny skrót: 5.fori + tab, tworzy nam automatycznie pętlę z warunkiem jeżeli i < 5
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //przydatny skrót: 5.forr + tab, tworzy automatycznie pętle odwrotną (reversed), czyli od wartości 5 do 0
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        //do wyświetlenia wszystkich elementów z tablicy możemy użyć porównania do długości tablicy
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        //enhanced for, dobra do używania na kolekcjach, tudzież tablicach, obiektach etc
        //deklarujemy w niej zmienną, w tym wypadku liczbową, do której po kolei będą podstawiane poszczególne
        //elementy tablicy o nazwie tablica.
        for (int zmiennaLiczbowa : tablica) {
            if (zmiennaLiczbowa % 2 == 0) { //w tym wypadku sprawdzamy czy zmiennaLiczbowa jest podzielna przez dwa,
                //czyli jej reszta z dzielenia równa się 0. Jeżeli tak to wyświetlamy ją
                System.out.println(zmiennaLiczbowa);
            }
        }

        //pętle mogą korzystać też z dwóch słów kluczowych break i continue
        for (int zmiennaLiczbowa2 : tablica) {
            if (zmiennaLiczbowa2 == 52 || zmiennaLiczbowa2 == 7) {
                continue; //w tym wypadku gdy zmiennaLiczbowa2 będzie równa wartości 52 lub 7, to te wartości zostaną
                // pominięte przy wyświetlaniu. Kolejne wartości pętli zostaną wyświetlone.
            }
            if (zmiennaLiczbowa2 == 55) {
                break; //natomiast gdy zmiennaLiczbowa będzie równa 55, to break przerwie działanie całej pętli,
                //to znaczy, że kolejne elementy w tablicy nie zostaną wyświetlone
            }
            System.out.println(zmiennaLiczbowa2);
        }

        //pętla while i przykłady
        int licznik = 200; //deklarujemy licznik
        while(licznik > 20) { //następnie sprawdzamy condition, dopóki licznik jest większe od 20 to wykonuj operacje w pętli
            System.out.println(licznik + " * " + licznik + " = " + (licznik * licznik)); //coś tam se wyświetlamy
            licznik--; //modyfikujemy wartość naszego licznika
        }

        licznik = 2; //ustawiamy licznik np na 2
        boolean flag = true; //definiujemy flagę na true
        while (flag) { //używamy flagi jako condition, pętla wykonywać się będzie dopóki flaga będzie miała wartość true
            if (licznik == 10) { //sprawdzamy czy licznik jest już równy 10
                flag = false; //jeżeli tak to zmieniamy wartość flagi na false
            }
            System.out.println("Licznik : " + licznik++); //wypisujemy sobie coś i modyfikujemy wartość licznika
        } //po osiągnięciu wartości 10, flag zostaje ustawiona na false, system.out wykonuje się poraz ostatni dla wartości 10
        //kolejny raz pętla już się nie wykonuje

        while (true) { //ustawiamy condition na true, tworzymy tym samym pętlę nieskończoną
            if (licznik == 20) { //sprawdzamy czy licznik osiągnął stan 20
                break; //jeżeli tak przerywamy działanie pętli nieskończonej używając break
            }
            System.out.println("Licznik : " + licznik++);
        }


        //pętla do...while, różni się od pętli while tym, że gwarantuje wykonanie przynajmniej raz.
        //jeżeli pętla while będzie miała na starcie ustawione condition, które się nie spełni, to jej kod nigdy się nie wykona,
        //np ustawiamy licznik na 2, a condition while(licznik > 20), widzimy że 2 nie jest większe od 20, więc kod pętla zostanie
        //pominięta. Natomiast w do..while, najpierw wykonujemy jakąś część kodu, a dopiero później sprawdzamy warunek
        //więc w tym przypadku kod wykona się przynajmniej raz
        licznik = 2;
        do {
            System.out.println(licznik + " * " + licznik + " = " + (licznik * licznik));
            licznik++;
        } while(licznik > 20);

        int index = 0;
        while (index < tablica.length) {
            System.out.println(tablica[index]);
            index++;
        }
    }
}
