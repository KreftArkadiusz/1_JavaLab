import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsze imię: ");
        String imie1 = scan.next();
        System.out.println("Podaj drugie imię: ");
        String imie2 = scan.next();

        if(imie1.length()>imie2.length())
        {
            System.out.printf("Imię %s jest dłuższe od imienia %s\n",imie1,imie2);
        }
        else if(imie1.length()<imie2.length())
        {
            System.out.printf("Imie %s jest dłuższe od imienia %s\n",imie2,imie1);
        }
        else
        {
            System.out.println("Imiona mają taką samą długość.");
        }

        System.out.println("Ile masz lat?");
        int wiek = scan.nextInt();

        if(wiek>=18)
        {
            System.out.println("Jesteś już pełnoletni!");
        }
        else
        {
            System.out.printf("Do osiągnięcia dorosłego wieku brakuje Ci %d lat.\n",18-wiek);
        }

        System.out.println("Podaj pin do telefonu: ");
        int poprawnyPinTelefonu = 1234;
        int ilosc_prob = 3;
        Boolean zalogowano = false;

        while(ilosc_prob>0)
        {
            int wprowadzonyPin = scan.nextInt();
            if(wprowadzonyPin != poprawnyPinTelefonu)
            {
                System.out.println("Pin niepoprawny, spróbuj jeszcze raz.\n");
            }
            else
            {
                System.out.println("Pin poprawny!\n");
                zalogowano=true;
                break;
            }
            ilosc_prob--;
        }

        if(zalogowano)
        {
            System.out.printf("Udało Ci się zalogować za %d razem!\n",3-ilosc_prob+1);
        }
        else
        {
            System.out.println("Nie udało Ci się zalogować\n");
        }

    }
}
