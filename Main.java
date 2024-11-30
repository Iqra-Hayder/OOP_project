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
   
   }//End of Address class
   
class Person{
  protected String name;
  protected String email;
  protected String dateOfBirth;
//constructors
  Person(){
  }
  Person(String nam, String email, String date){
    this.name = nam;
    this.email = email;
    this.dateOfBirth = date;
  }
//setters
  public void setName(String nam){
    this.name = nam;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setDateOfBirth(String date){
    this.dateOfBirth = date;
  }
//getters
  public String getName(){
    return this.name;
  }
  public String getEmail(){
    return this.email;
  }
  public String getDateOfBirth(){
    return this.dateOfBirth;
  }
  @Override
  public String toString(){
    return "Name: "+this.name+"\nEamil: "+this.email+"\nDate Of Birth: "+this.dateOfBirth;
  }
}//End of Person class

public class Main {
  public static void main(String[] args) {
  
  }
}
