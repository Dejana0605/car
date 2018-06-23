package person;

public class Student extends Person {
    private String indexNumber;
    private int currentYear;
    
    public String getIndexNumber(){
        return indexNumber;
    }
    
    public void setIndexNumber(String IN){
        this.indexNumber = IN;
    }
    
    public int getCurrentYear(){
        return currentYear;
    }
    
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }
    
    public Student(String name, String surname, String jmbg){
       super(name, surname, jmbg);
    }
    
    public Student(String name, String surname, String jmbg, String indexNumber, int currentYear){
       super(name, surname, jmbg);
       this.indexNumber = indexNumber;
       this.currentYear = currentYear;
    }
    
    @Override
    public void showData(){
        
        System.out.println("Index number: " + getIndexNumber());
        System.out.println("Current year: " + getCurrentYear());
        super.showData();
    }
}
