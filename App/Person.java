package App;

class Person {
    String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person() {

    }

    public void setSurname(String surname){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }




    public String getFullName(){
        return name + " " + surname;
    }
}