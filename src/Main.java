import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        if(22%3==0)
        {
            System.out.println("Podzielny przez 3");
        }
        else if (22%3!=0)
        {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        Boolean czyParzysty = (62849 % 2 == 0) ? true : false;

        if(czyParzysty=true)
        {
            System.out.println("Indeks jest parzysty");
        }
        else
        {
            System.out.println("Indeks jest nieparzysty");
        }

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);

        float wprowadzonyFloat = scan.nextFloat();

        if(wprowadzonyFloat<10)
        {
            System.out.println("Wprowadzona liczba jest mniejsza od 10.");
        }
        else if(wprowadzonyFloat<100)
        {
            System.out.println("Wprowadzona liczba jest mniejsza od 100");
        }
        else if(wprowadzonyFloat<1000)
        {
            System.out.println("Wprowadzona liczba jest mniejsza od 1000");
        }
        else
        {
            System.out.println("Wprowadzona liczba jest większa od 1000.");
        }

    }
}
