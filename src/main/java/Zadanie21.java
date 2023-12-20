/*Napisz program, który sprawdzi, czy liczba/ciąg znaków wprowadzonych przez użytkownika jest palindromem.

        Czym jest palindrom?

        Pobierz dane od użytkownika
        Przypisz pobrane dane do zmiennej
        Odwróć wprowadzoną liczbe/ciąg znaków
        Porównaj odwróconą wartość z daną wprowadzoną przez użytkownika
        Jeśli liczba/ciąg znaków jest palindromem, wyświetl odpowiedni komentarz
        Jeśli nie, wydrukuj komunikat "To nie jest palindrom"*/


import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.next();
        StringBuilder slowo1 = new StringBuilder();
        StringBuilder slowo2 = new StringBuilder();
        slowo1.append(slowo);
        slowo1.reverse();
        String a = slowo1.toString();
        slowo2.append(slowo);
        String b = slowo2.toString();
        System.out.println(slowo1);
        System.out.println(slowo2);
        if (a.equals(b))
        {
            System.out.println("To jest palindrom");
        }else
        {
            System.out.println("To nie jest palindrom");
        }


}
}
