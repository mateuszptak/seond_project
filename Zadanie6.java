import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dochod:");
        double income = scanner.nextDouble();

        if (income < 85_528) {
            double tax18 = (income * 0.18) - 556.02;
            System.out.println("Podatek do zapłaty wybnosi: " + (tax18 < 0 ? 0 : tax18));
        } if (income >= 85_528) {
            double tax32 = ((income - 85_528) * 0.32 + 14_839.02);
            System.out.println("Podatek do zapłaty wybnosi: " + (tax32 < 0 ? 0 : tax32));
        }
    }
}

// napisz program obliczajacy nalezny podatek dochodowy od osob fizycznych.
// program ma pobierac od uzytkownika dochod i po obliczeniu wypisywac na ekranie nalezny podatek.
// Podatek odliczony wg. nastepujacych reguł:
// - do 85528 podatek wynosi 18% podstawowy minus 556,02 PLN
// - od 85528 podatek wynosi 14839,02 PLN + 32% nadwyzki ponad 85528
