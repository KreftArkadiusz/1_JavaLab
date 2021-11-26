import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

            byte testbyte = 111;
            System.out.println("Zmienna byte = "+testbyte);

            String teststring = "test";
            System.out.println("Zmienna String = "+teststring);

            float testfloat = 2.2f;
            System.out.println("Zmnienna float = "+testfloat);

            double testdouble = 2.6;
            System.out.println("Zmnienna double = "+testdouble);

            char testchar = 'x';
            System.out.println("Zmnienna char = "+testchar);

            System.out.println("\n");

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

            int testint1 = 14, testint2 = 52;

            //na intach

            System.out.println("Wyniki działań wykonywanych na intach: ");

            System.out.println(testint1+testint2);
            System.out.println(testint1-testint2);
            System.out.println(testint1*testint2);
            System.out.println(testint1/testint2);

            double testdouble1 = 13.6, testdouble2 = 5.1;

            System.out.println("Wyniki działań wykonywanych na doublach: ");

            System.out.println(testdouble1+testdouble2);
            System.out.println(testdouble1-testdouble2);
            System.out.println(testdouble1*testdouble2);
            System.out.println(testdouble1/testdouble2);

    }
}
