import java.util.Scanner;

public class Zadanie14 {
/*
    Napisz program, który wydrukuje tabliczkę mnożenia dla zakresu podanego przez użytkownika.
*/
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Jaka liczba ma zostać przemnożona?");
    int liczbaDomnozenia = scanner.nextInt();
    System.out.println("Ile razy liczba ma zostać mnożona?");
    int iloscMnozen = scanner.nextInt();
    for (int i = 0; i < iloscMnozen + 1; i++) {
        System.out.println(liczbaDomnozenia + "*"+ i + "="+ (liczbaDomnozenia * i));
    }
}
}
