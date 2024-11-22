package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz wejsc do sklepu? Tak / Nie");
        String output = scanner.nextLine();

        boolean done = false;

        if (Objects.equals(output, "Nie")) {
            System.out.println("Ok, bajo");
        } else {
            System.out.println("Witaj w sklepie mordo");
            System.out.println("Co chcesz kupic? (Buty, Koszulke, Spodnie)?");
            String item = scanner.nextLine();
            if (Objects.equals(item, "Buty")){
                System.out.println("Dostepne rozmiary to (41,42,46) - podaj mi swój abym mógł Ci zaproponować konkretny model");
                String shoesSize = scanner.nextLine();
                if (Objects.equals(shoesSize, "41") || Objects.equals(shoesSize, "42") || Objects.equals(shoesSize, "46")) {
                    System.out.println("Dostepne modele - Iron, Golden, Picker. Wybierz swoje:");
                }
            }
        }


//        Person janTestowy = new Person("Janek", "Nawiskowy");
//        Person maciekZKlanu = new Person("Maciej", "SKLANU");
//
//        Address address = new Address("Warszawa", 22);
//
//        Student student = new Student(janTestowy, 11);
        // jak w princie wyskakuje app.student@213f3f to sie nazywa referencja, czyli jego polozenie
        // niejawnie uzywa metody toString();

//        System.out.println(student.getIndexNumber());
// do dokonczenia ustawienie nowego adresu za pomoca getCity
//        janTestowy.address.setAddress();
//        System.out.println(janTestowy.address.getAdres());

//        System.out.println(janTestowy.getSurname());
//        janTestowy.name = "JanPoZmianie";
//        System.out.println(janTestowy.getSurname());

        // do naprawy GETTER!!!!! zmieniajacy nazwisko w zaleznosci od wieku

//        Employee employee = new Employee(janTestowy, Department.FINANCE);
//        Employee secondEmployee = new Employee(janTestowy, Department.FINANCE);
//        Employee thirdEmployee = new Employee(janTestowy, Department.FINANCE);
//
//        System.out.println(employee);


//        List<Employee> employees = new ArrayList<Employee>();
//
//        employees.add(secondEmployee);
//        employees.add(employee);
//        employees.add(thirdEmployee);
//
//        Company company = new Company("My Company");
//
//
//
//        System.out.println(company.getEmployees());

    }
}







// cechy programowania obiektowego
// abstrakcja, dziedziczenie, polimorfizm, hermetyzacja
