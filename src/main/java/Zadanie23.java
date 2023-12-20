/*
Napisz program, który pobierze wycinek z wybranego ciągu znaków wprowadzonego przez użytkownika.
 Zakres wycinka, również powinien zostać wybrany przez użytkownika -
  użytkownik podaje dwie liczby początek,
   koniec - numery znaków w podanym wyrażeniu,
*/

import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ciagOrgin = scanner.nextLine();
        System.out.println("Podaj numer znaku od którego zacząć wycinanie");
        int cutStart = scanner.nextInt();
        System.out.println("Podaj numer znaku od którego zakończyć wycinanie");
        int cutStop = scanner.nextInt();
        System.out.println("Wycinek: "+ciagOrgin.substring(cutStart, cutStop));
    }
}
