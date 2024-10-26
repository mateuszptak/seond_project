import java.util.Arrays;
import java.util.Scanner;

public class PrzekazanieZmiennejWrazZUrchomieniemProgramu {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe od 1 - 100.");
//
//        int number = scanner.nextInt();

        // Aby dostac sie do argumentow przekazanych w main args
//        Arrays.stream(args).forEach(args);

        // nalezy to odpalic poprzez cmd

        int number = Integer.parseInt(args[0]);

        if (number < 99) {
            System.out.println("Liczba " + number + " jest mniejsza od " + 99);
        } else if (number == 99) {
            System.out.println("Liczba " + number + " jest równa " + 99);
        } else {
            System.out.println("Liczba " + number + " wieksza od " + 99);
        }

    }
}
