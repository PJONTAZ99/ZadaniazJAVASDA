import java.util.Scanner;

public class Zadanie12 {
/*
    Napisz program, który pobierze od użytkownika, dodatnią liczbę całkowitą,
     a następnie wypisze wszystkie liczby nieparzyste,
      nie większe od tej liczby.
*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj dodatnią liczbę całkowitą");
    int liczba = scanner.nextInt();
    System.out.println("Uwaga! \nWypisuję liczby nieparzyste.");

    for (int i = 1; i <=liczba ; i++) {
        if (i%2!=0)//liczba parzysta przy dzieleniu przez 2 ma resztę zero
        {
            System.out.println(i);
        }
    }
}
}
