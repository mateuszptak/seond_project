package App;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person janTestowy = new Person("Janek", "Nawiskowy");
        Person maciekZKlanu = new Person("Maciej", "SKLANU");

        Address address = new Address("Warszawa", 22);

        Student student = new Student(janTestowy, 11);
        // jak w princie wyskakuje app.student@213f3f to sie nazywa referencja, czyli jego polozenie
        // niejawnie uzywa metody toString();

        System.out.println(student.getIndexNumber());
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


        List<Employee> employees = new ArrayList<Employee>();

    }
}







// cechy programowania obiektowego
// abstrakcja, dziedziczenie, polimorfizm, hermetyzacja
