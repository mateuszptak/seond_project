package App;

class Address {
    private String address;
    private int homeNumber;

    public Address(String adres, int homeNumber) {
        this.address = adres;
        this.homeNumber = homeNumber;
    }

    public void setAddress(String address, int homeNumber){
        this.address = address;
    }

    public void setHomeNumber(){
        this.homeNumber = homeNumber;
    }

    public String getAdres(){
        return address;
    }

    public int getHomeNumber(){
        return homeNumber;
    }
}
