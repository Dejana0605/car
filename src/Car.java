public class Car {
    
    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String license = "ABC-123";
    char condition = 'A'; 
    double currentPrice = 3000;
    int mileagePassed = 50000;
    
    public Car() {
        
    }
    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn, String license, char condition, double currentPrice, int mileagePassed) {
        
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.license = license;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.mileagePassed = mileagePassed;
    }
    
    public void changeMileage(int newMileage){
       int diff; 
       int multiplyChange;
       
        if(newMileage > mileagePassed){
 
            diff = newMileage - mileagePassed;
            multiplyChange = diff / 10000;
            this.currentPrice = currentPrice - multiplyChange * 300;
            this.mileagePassed = newMileage;
        }
        if(newMileage < mileagePassed){
            
            diff = mileagePassed - newMileage;
            multiplyChange = diff / 10000;
            this.currentPrice = currentPrice + multiplyChange * 300;
            this.mileagePassed = newMileage;
        }
    }
}
