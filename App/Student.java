package App;

class Student extends Person {
    private int indexNumber;

    public Student(Person person, int indexNumber){
        // przekazujemy to co ma Person w konstruktorze
        super(person.getName(), person.getSurname());
        this.indexNumber = indexNumber;
    }
    // TODO: jak zrobic drugi konstruktor
//    public Student(String name, String surname, int age, int indexNumber){
//        this.name = name;
//        this.surname = surname;
//        this.age;
//        this.indexNumber;
//    }

    public int getIndexNumber(){
        return indexNumber;
    }

    public void setStudentNumber(int indexNumber){
        this.indexNumber = indexNumber;
    }



}
