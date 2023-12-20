import java.util.Scanner;

public class Zadanie7 {

/*
    Napisz program, który pobiera imie od użytkownika, najpierw jednak wypisze na ekran słowa "Podaj swoje imie".
     Imię powinno zostać wydrukowane na ekran.
      Jeśli podane imię zgadza się z "John Wick",
      to na ekran program powinien wypisać "Widzę, że znów pracujesz John",
       w przeciwnym przypadku program powinien wydrukować na ekran "Witaj, [xyz]",
        gdzie [xyz], powinno zostać zastąpione wartością podaną przez użytkownika.
*/
    public static void main(String[] args) {
        String specialName = "John Wick";//specjalne imie
        System.out.println("Podaj swoje imie");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();//pobranie od użytkownika
        System.out.println("Twoje imię to "+ imie);

        if (specialName.contains(imie))//Warunek sprawdza czy imie zawiera się w specjanym imieniu
        {
            System.out.println("Widzę, że znów pracujesz John");
        }
        else {

            System.out.println("Witaj, "+ imie);
        }

    }
}
