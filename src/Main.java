
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed + " km/h.");
        System.out.println(myCar.condition);
        System.out.println(myCar.license);
        System.out.println(myCar.weight);
        System.out.println(myCar.minSpeed);
        
        Car companyCar = new Car(150, 30, 2000, false, "AB-554", 'B', 3500, 75000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed + " km/h.");
        
        companyCar.changeMileage(85000);
        System.out.println(companyCar.mileagePassed);
        System.out.println(companyCar.currentPrice);
        
        myCar.changeMileage(35000);
        System.out.println(myCar.mileagePassed);
        System.out.println(myCar.currentPrice);
    }

}
