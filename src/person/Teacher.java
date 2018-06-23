package person;

public class Teacher extends Person {
    private int teacherId;
    private String subject;
    
    public int getTeacherId(){
        return teacherId;
    }
    
    public void setTeacherId(int id){
        this.teacherId = id;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public Teacher(String name, String surname, String jmbg){
        super(name, surname, jmbg);
    }
    
    public Teacher(String name, String surname, String jmbg, int teacherId, String subject){
        super(name, surname, jmbg);
        this.teacherId = teacherId;
        this.subject = subject;
    }
    
    @Override
    public void showData(){
        System.out.println("Teacher id: " + getTeacherId());
        System.out.println("Subject: " + getSubject());
        super.showData();
    }
}
