
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed + " km/h.");
        
        Car companyCar = new Car(150, 30, 2000, false, "AB-554", 'B', 3500, 75000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed + " km/h.");
 
    }

}
