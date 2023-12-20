import java.util.Scanner;

/*
Napisz program, który porówna dwa ciągi znaków wprowadzone przez użytkownika.
Program powinien zwrócić wartość True,
 jeśli obiekty są równe,
  w przeciwnym przypadku program powinien zwrócić false.
*/
public class Zadanie22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ciag1 = scanner.nextLine();
        String ciag2 = scanner.nextLine();
        boolean porownaj =(ciag1.equals(ciag2));
        if (porownaj){
            System.out.println("Wynik porównania: "+ porownaj);
        }else {
            System.out.println("Wynik porównania: "+ porownaj);
        }
    }
}
