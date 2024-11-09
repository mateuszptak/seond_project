public class Test {
    public static void main(String[] args) {
//        int firstNumber = Utils.input("Podaj liczbe:");
//        System.out.println(firstNumber);
//
//        Utils utils = new Utils();
//        utils.inputINtObject("Siema, ile dasz mi szlugów?");
//        Student student = new Student("Mateusz", "Ptak", 11);
//        System.out.println(student);
//
//        System.out.println(student.getAge());
//
//        System.out.println(student.getFullName());


        Car myCar = new Car("White", "BMW");

        System.out.println("I have " + myCar.getMake() + " and it's color is " + myCar.getColor());


    }
}

class Car {
   private String color;
    private String make;

    public Car(String color, String make) {
        this.make = make;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String getMake(){
        return make;
    }

    public void setColor(String color){
        this.color = color;
    }
}







class Student {
   private String name;
   private String surname;
   private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }
}