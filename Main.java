package OOP_project;


class Address{
 private String city;
 private int zipCode;
////// Constructors
Address(){}
Address(String city, int zipCode){
    this.city = city;
    this.zipCode = zipCode;
}
/////// setters
public void setCity(String city){
   this.city = city;
}
public void setZipCode(int zipCode){
  this.zipCode = zipCode;
}
/////// getters
public String getCity(){
  return this.city;
}
public int getZipCode(){
  return this.zipCode;
}

@Override
public String toString(){
  return "City: " + city + ", Zip Code: " + zipCode ;
}

}

public class Main {
  public static void main(String[] args) {
  
  }
}
