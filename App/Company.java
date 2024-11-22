package App;

import java.util.Comparator;
import java.util.List;

class Company {
   String name;
   List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Company(String name){
       this.name = name;
   }

   public void setName(String name){
       this.name = name;
   }

   public String getName(){
       return name;
   }
}
