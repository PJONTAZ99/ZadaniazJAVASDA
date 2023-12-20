
    /*Przeanalizuj poniższy kod, zawierający metodę fizzBuzz. Działanie programu polega na pobraniu liczby całkowitej od użytkownika i sprawdzeniu trzech warunków:

    jeśli liczba jest podzielna przez 3, to program powinien wydrukować słowo "fizz"
    jeśli liczba jest podzielna przez 5, to program powinien wydrukować słowo "buzz"
    jeśli liczba jest podzielna przez 3 i 5 to program powinien wydrukować słowo "fizzbuzz"
    Niestety poniższy program zawiera błędy, nie kompiluje się. Popraw błędy, aby przywrócić prawidłowe działanie programu, gdy użytkownik podaje liczbę wejściową.*/
    /*Kod do przeanalizowania
import java.util.Scanner;

    public class Exercise17 {
        public static void main(String[] args)
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = readNumber.nextInt();
        String fizzBuzzResult = fizzBuzz(number);
        System.out.println();
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                return "fizzbuzz"
            } else {
                return "fizz"; }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number); }
}*/
    import java.util.Scanner;
    public class Zadanie17 {


            public static void main(String[] args){
            Scanner readNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
            int number = readNumber.nextInt();
            fizzBuzz(number);
        System.out.println();
        }

        public static  void fizzBuzz(int number) {
                if (number % 3 == 0) {
                    System.out.print("fizz");
                }


              if (number % 5 == 0) {
                  System.out.print("buzz");
              }

            }
    }

