package Exercises;

public class Excersise3 {
    public static void main(String[] args) {
        double price = Utils.input("Podaj cene towaru od 100 do 10k PLN:");
        double rate = Utils.input("Podaj liczbe rat od 6 - 48:");

        if (Utils.isParameterInvalid(price, rate)) {
            System.out.println("Wprowadziłeś złe dane");
        } else {
            double multiplier;
            multiplier = getMultiplier(rate);
            calculateAndShowReslut(price, multiplier, rate);
        }

    }



    private static void calculateAndShowReslut(double price, double multiplier, double rate) {
        double rateValue;
        double total;
        double interest;
        interest = price * multiplier;
        total = price + interest;
        rateValue = total / rate;

        System.out.println("Cena produktu: " + price + "PLN, ilość rat: " + rate);
        System.out.println("----------------------------------");
        System.out.println("Odsetki: " + interest);
        System.out.println("Łączny koszt: " + total);
        System.out.println("Wysokość raty: " + rateValue);
    }

    private static double getMultiplier(double rate) {
        double multiplier;
        if (rate >= 6 && rate <= 12) {
            multiplier = 0.025;
        } else if (rate > 12 && rate <= 24) {
            multiplier = 0.05;
        } else {
            multiplier = 0.1;
        }
        return multiplier;
    }



}

// W sklepie AGD oferowana jest sprzedaz ratalna. Napisz program umozliwiajacy wyliczneie wysokosci miesiecznej raty za
// zakupiony sprzet. Danymi wejsciowymi dla programu sa:
// cena towardu od 100 do 10k, liczba rat od 6 do 48.
// Kredyt jest oprocentowany w zaleznosci od ilosci rat: 6-12 wynosi 2.5%, od 13-24 5%, od 25-48 wynosi 10%.
// obliczona miesieczna rata powinna zawierac rowniez odsetki. Program powinien sprawdzac czy podane dane mieszcza sie w
// okreslonych powyzej zakresach, a w przypadku bledu pytac i prosic uzytkownika ponownie o podanie danych
