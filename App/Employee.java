package App;

class Employee extends Person {

    private Department department;

    public Employee(Person person, Department department){
        super();
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
