package person;

public class Person {
   
    private String name;
    private String surname; 
    private String jmbg;
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getJmbg(){
        return jmbg;
    }
    
    public void setJmbg(String jmbg){
        this.jmbg = jmbg;
    }
    
    public Person(){
        this.name = "defaultName";
        this.surname = "defaultSurname";
        this.jmbg = "defaultJmbg";
    }
    
    public Person(String name, String surname, String jmbg){
        this.name = name;
        this.surname = surname;
        this.jmbg = jmbg;
    }
    
    public void showData(){
        System.out.println("Name is " + getName());
        System.out.println("Surname is " + getSurname());
        System.out.println("JMBG: " + getJmbg());
        System.out.println(" ");
    }
}
