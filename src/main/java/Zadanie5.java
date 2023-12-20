import java.util.Scanner;

public class Zadanie5 {

   /* Napisz program, który pobiera dwie liczby całkowite, a następnie wykonuje następujące operacje matematyczne:

    dodawanie
            odejmowanie
    mnożenie
            dzielenie
    podniesienie do potęgi (pierwszy argument to liczba, która będzie podnoszona do potęgi, drugi argument to potęga, do której podnosimy liczbę)
    Wynik operacji powinien zostać przypisany do nowo utworzonej zmiennej, odpowiedniego typu.

    Wynik powinien zostać wyświetlony na ekranie, w następującej postaci:

    dodawanie -> "a = A, b = B, wynik to C"
    odejmowanie -> "a = A, b = B, wynik to C"
    mnożenie -> "a = A, b = B, wynik to C"
    dzielenie -> "a = A, b = B, wynik to C"
    podniesienie do potęgi -> "a = A, podniesione do potęgi B, daje wynik C"*/
    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitę dla a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//pobranie liczby od użytkownika
        System.out.println("Podaj liczbę całkowitą dla b");
        int b = scanner.nextInt();//pobranie liczby od użytkownika
        System.out.println("a = "+a+", b = "+b+", wynik to "+ (a+b));//dodawanie
        System.out.println("a = "+a+", b = "+b+", wynik to "+ (a-b));//odejmowanie
        System.out.println("a = "+a+", b = "+b+", wynik to "+ (a*b));//mnożenie
        System.out.println("a = "+a+", b = "+b+", wynik to "+ (a/b));//dzielenie
        System.out.println(a+" podniesione do potęgi, "+b+", daje wynik  "+ (Math.pow(a,b)));//potęgowanie


    }
}
