import java.util.Scanner;

public class Zadanie6 {
/*
    Napisz program, który pobiera hasło od użytkownika, najpierw jednak wypisze na ekran słowa "Poproszę hasło".
     Pobrane hasło powinno zostać wypisane na ekran.
      Jeśli hasło zgadza się z hasłem wzorcowym "secret", to na ekran powinien zostać wypisany tekst "Witaj w tajnym miejscu",
       w przeciwnym przypadku zakończ działanie programu.
*/
    public static void main(String[] args) {
        String password = "secret";//poprawne hasło w zmiennej
        System.out.println("Poproszę hasło");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();//pobranie hasła
        System.out.println("Podane hasło to "+ user);//wyświetlene komuunikatu jakie hasło zostało wpisane
        if (user.equals(password))//porównanie hasła z tym co wpisał użytkownik
        {
            System.out.println("Witaj w tajnym miejscu");
        }



    }
}
