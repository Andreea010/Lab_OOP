package Lab6;

public class Address {
    public String address;
    public Address (String address){
        this.address = address;
    }

    @Override
    public String toString (){
        return  address;
    }
}
