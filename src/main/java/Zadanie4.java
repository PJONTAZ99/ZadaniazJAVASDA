import java.util.Scanner;

public class Zadanie4 {
   /* Napisz program, który pobierze od użytkownika liczbę całkowitą i wypisze ją na ekran.
   Na ekranie powinien wyświetlać się następujący komunikat "Użytkownik wprowadził X",
   gdzie X jest liczbą podaną przez użytkownika.
    Zakładamy sytuację, w której użytkownik, nie będzie wprowadzał innych typów danych niż liczby całkowite.

    Do obsługi wprowadzania danych przez użytkownika zastosuj bibliotekę Scanner.
    Wykonaj testy, sprawdź jak program, zachowuje się dla innych typów danych.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");//Polecenie dla użytkownika
       int liczba = scanner.nextInt();//pobranie liczby
        System.out.println("Użytkownik wprowadził "+ liczba);//wyświetlenie komunikatu
    }
}
