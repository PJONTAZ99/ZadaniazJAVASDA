import java.util.Scanner;

public class Zadanie15 {
    /*Napisz program, który pobiera liczbę całkowitą od użytkownika i zwraca liczbę odwróconą.

    dla liczby 1234, program powinien zwrócić 4321
    dla liczby 654789, program powinien zwrócić 987456*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liczba = scanner.next();
        for (int i = liczba.length()-1; i >= 0; i--) {
            System.out.println(liczba.charAt(i));
        }


    }
}
