import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String imie = scan.next();
        System.out.println("Podaj swoje nazwisko: ");
        String nazwisko = scan.next();
        System.out.println("Podaj swój wiek: ");
        int wiek = scan.nextInt();
        System.out.println("Podaj swój nr indeksu: ");
        String nrindeksu = scan.next();

        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.printf("Wiek: %d\n",wiek);
        System.out.printf("Nr Indeksu: %s\n",nrindeksu);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.println("Podaj pierwszą wartosc: ");
        int zmienna1 = scan.nextInt();
        System.out.println("Podaj drugą wartosc: ");
        int zmienna2 = scan.nextInt();

        System.out.printf("Wynik działania %d + %d = %d\n", zmienna1, zmienna2, zmienna1+zmienna2);
        System.out.printf("Wynik działania %d - %d = %d\n", zmienna1, zmienna2, zmienna1-zmienna2);
        System.out.printf("Wynik działania %d * %d = %d\n", zmienna1, zmienna2, zmienna1*zmienna2);
        double wynikdzielenia = zmienna1/zmienna2;
        System.out.printf("Wynik działania %d / %d = %f\n", zmienna1, zmienna2, wynikdzielenia);
        System.out.printf("Wynik działania %d modulo %d = %d\n", zmienna1, zmienna2, zmienna1%zmienna2);

    }
}
