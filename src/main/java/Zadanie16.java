import java.util.Scanner;

public class Zadanie16 {
    /*Sklep internetowy oferuje sprzedaż ratalną. Napisz program,
     który policzy ratę miesięczną za zakupiony towar.
      Danymi wejściowymi dla programu są:

    cena towaru od 100 zł do 10000 zł
    liczba rat od 6 do 48
    Oprocentowanie jest zależne od liczby rat:

    liczba rat od 6 do 12, oprocentowanie 2,5%
    liczba rat od 13 do 24, oprocentowanie 5%
    liczba rat od 25-48, oprocentowanie 10%
    Użytkownik samodzielnie wybiera liczbę rat oraz kwotę pożyczki.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cena towaru od 100 zł do 10000 zł \n Podaj kwotę!");
do {


        double kwota = scanner.nextDouble();
        if (kwota>=100 && kwota<=10000)
        {
            System.out.println("Ilość rat od 6 do 48 \n Podaj ilość rat!");
        }
        else {
            System.out.println("Podano złą kwotę");
            break;
        }

        double iloscrat = scanner.nextDouble();
        if (iloscrat >= 6 && iloscrat <=12){
        double rat1 = (kwota/iloscrat+(kwota/iloscrat)*2.5/100);
      System.out.format("Kwota pojedynczej raty to "+"%.2f%n", rat1);
    }
        if (iloscrat >= 13 && iloscrat <=24){
        double rat2 = (kwota/iloscrat+(kwota/iloscrat)*5/100);
            System.out.format("Kwota pojedynczej raty to "+"%.2f%n", rat2);
    }
        if (iloscrat >= 25 && iloscrat <=48){
        double rat3 = (kwota/iloscrat+(kwota/iloscrat)*10/100);
            System.out.format("Kwota pojedynczej raty to "+"%.2f%n", rat3);
    }
        if (iloscrat<6 || iloscrat>48)
        {
            System.out.println("Podano złą ilość rat");
            break;
        }
}while(true);
}
}
