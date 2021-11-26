import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[]liczby = new double[]{11.5,15.8,5.1,55.533,12213.41234};

        int wskaznik = 0;

        while(wskaznik<5)
        {
            System.out.println(liczby[wskaznik]);
            wskaznik++;
        }
    }
}
