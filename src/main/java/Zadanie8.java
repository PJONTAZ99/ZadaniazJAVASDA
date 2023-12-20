import java.util.Scanner;

public class Zadanie8 {
    /*Napisz program, który dokona konwersji temperatury wprowadzonej przez użytkownika:

    ze skali Celsjusza na skalę Fahrenheit'a (stopnie w F = 1.8 * stopnie w C + 32)
    ze skali Fahrenheit'a na skalę Celsjusza (stopnie w C = (stopnie w F - 32 / 1.8))
    ze skali Celsjusza na skalę Kelvin'a (stopnie w K = stopnie w C + 273.15)
    ze skali Kelvin'a na skalę Celsjusza (stopnie w C = stopnie w K - 273.15)
    ze skali Kelvin'a na skalę Fahrenheit'a (stopnie w F = (stopnie w K - 273.15) * 1.8 + 32)
    ze skali Fahrenheit'a na skalę Kelvin'a (stopnie w K = ((stopnie w F - 32/1.8) + 273.15)
    Każdą z operacji konwersji temperatury, napisz w osobnej metodzie, którą następnie wywołasz w metodzie main.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę");
        double temp = scanner.nextDouble();// pobiera liczbę
        celcOnFaren(temp);
        fahrOnCelc(temp);
        celcOnKelv(temp);
        kelvOnCelc(temp);
        kelvOnFahr(temp);
        fahrOnKelv(temp);
    }

    private static void celcOnKelv(double temp) {
        double wynik = temp + 273.15;//wzór
        System.out.println("C do K "+ wynik);//wyświetlenie
    }

    private static void fahrOnKelv(double temp) {
        double wynik = (temp- 32/1.8)+ 273.15;//wzór
        System.out.println("F do K "+ wynik);//wyświetlenie
    }

    private static void kelvOnFahr(double temp) {
        double wynik = (temp- 273.15) * 1.8 + 32;
        System.out.println("K do F "+ wynik);
    }

    private static void kelvOnCelc(double temp) {
        double wynik = temp - 273.15;
        System.out.println("K do C "+ wynik);

    }

    private static void fahrOnCelc(double temp) {
        double wynik = (temp- 32) / 1.8;
        System.out.println("F do C "+ wynik);
    }

    public static void celcOnFaren(double temp)
    {
       double wynik = 1.8 * temp + 32;
        System.out.println("C do F " + wynik);
    }
}
