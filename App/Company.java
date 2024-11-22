package App;

class Company {
   String name;
   Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
