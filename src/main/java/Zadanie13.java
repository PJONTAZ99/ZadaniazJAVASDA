import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Zadanie13 {
  /*  Napisz program, który stworzy tablicę dla 10 elementów typu integer.
   Program powinien wypełnić tablicę losowymi liczbami z zakresu od [-10..10],
    a następnie:

    wydrukuje zawartość tablicy na ekran
    wydrukuje najmniejszą (minimalną) wartość z tablicy
    wydrukuje największą (maksymalną) wartość z tablicy*/
  public static void main(String[] args) {

      Integer tablicaLiczb[] = new Integer[10];
      int liczba;
      for (int i = 0; i < 10; i++) {
          Random random = new Random();
        liczba=  random.nextInt(-10,10);//generuje liczby z zakresu
          tablicaLiczb[i]=liczba ;
      }
      System.out.println("Zawartość tablicy:");
      for (int i = 0; i < 10; i++) {
          System.out.println("Liczba: "+tablicaLiczb[i]);//wypisuje tablice
      }
      int min = tablicaLiczb[0];
      int max = tablicaLiczb[0];
      for (int i = 0; i < 10; i++) {
          if (min>tablicaLiczb[i])// jesli min jest wiekszy od wartosci tablicy to przypisz mnijesze
          {
              min=tablicaLiczb[i];
          }
          if (max<tablicaLiczb[i])// jesli max jest mniejszy od wartosci tablicy to przypisz wieksze
          {
              max=tablicaLiczb[i];
          }
      }




      System.out.println("Minimalna wartość: "+ min);
      System.out.println("Maksymalna wartość: "+ max);

      System.out.println("SPOSÓB Z ARRAYLIST!!!!");


      ArrayList <Integer>car = new ArrayList<>();
      int liczbav;
      for (int i = 0; i < 10; i++) {
          Random random = new Random();
          liczbav=  random.nextInt(-10,10);//generuje liczby z zakresu
          car.add(liczbav);
      }
      System.out.println("Zawartość tablicy:");
      for (int i = 0; i < 10; i++) {
          System.out.println("Liczba: "+car.get(i));//wypisuje tablice
  }
  Collections.sort(car);//sotuje tutaj
      System.out.println("Max liczba " + car.getLast());
      System.out.println("Min liczba "+ car.getFirst());
}
}



