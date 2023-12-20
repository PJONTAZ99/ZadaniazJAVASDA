/*Napisz kalkulator, który przyjmuje od użytkownika następujące parametry:

        dwie liczby
        operator matematyczny (+, -, *, /)
        I wyświetla wynik operacji matematycznych na ekranie.*/

import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liczby = scanner.nextLine();
        String[] words = liczby.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println("podaj działanie arytmetyczne:\n+\n-\n*\n/");
        String dzialanie = scanner.next();

         int convertA = Integer.parseInt(words[0]);
         int convertB = Integer.parseInt(words[1]);
         if (dzialanie.equals("+")){
        System.out.println("Wynik: "+Math.addExact(convertA,convertB));}
         if (dzialanie.equals("-")){
        System.out.println("Wynik: "+Math.subtractExact(convertA,convertB));}
         if (dzialanie.equals("*")){
        System.out.println("Wynik: "+Math.multiplyExact(convertA,convertB));}
         if (dzialanie.equals("/")){
             if (convertB==0){
                 System.out.println("Nie można dzielić przez ZERO!!!");
             }else
        System.out.println("Wynik: "+Math.divideExact(convertA,convertB));}

    }
}
