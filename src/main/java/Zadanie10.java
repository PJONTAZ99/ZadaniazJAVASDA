import java.util.Scanner;

public class Zadanie10 {
/*
    Zmodyfikuj kod z poprzedniego zadania,
     w taki sposób, aby użytkownik samodzielnie podawał ilość wyświetlonych komunikatów.
*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ile razy powtórzyć?");
    int user = scanner.nextInt();
    for (int i = 1; i <user +1; i++) {//user oznacza max powtórzeń więc jest +1 bo indexy są liczone od 0
        System.out.println("To jest komunikat w pętli "+ i);
    }
}
}
