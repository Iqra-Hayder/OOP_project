package OOP_project;
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
}
public class Main {
    public static void main(String[] args) {
      
    }
}
