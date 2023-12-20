import java.util.Scanner;

public class Zadanie11 {
/*
    Napisz program, który pobiera hasło od użytkownika.
    Program powinien zapytać użytkownika o wprowadzenie poprawnego hasła.
     W przypadku gdy wprowadzone hasło będzie poprawne,
      program powinien wydrukować na ekranie tekst "Poprawne hasło",
       w przeciwnym wypadku, wprowadzone hasło powinno zostać wyświetlone na ekranie,
       a użytkownik powinien mieć możliwość ponownie wprowadzić hasło.
*/
public static void main(String[] args) {

    String correct = "gym";
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("Podaj hasło");
        String haslo = scanner.nextLine();
        if (haslo.equals(correct))
        {
            System.out.println(haslo+"--Poprawne hasło");
            break;
        }else
        {
            System.out.println(haslo+ "--Złe hasło ");
        }
    }while(true);

}
}
