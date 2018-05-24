
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String license = "ABC-123";
    char condition = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int currentFuel;
    int consumption;

    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
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

    public void changeMileage(int newMileage) {
        double diff;
        double multiplyChange;

        if (newMileage > mileagePassed) {

            diff = newMileage - mileagePassed;
            multiplyChange = diff / 10000;
            this.currentPrice = currentPrice - Math.round(multiplyChange) * 300;
            this.mileagePassed = newMileage;
        }
        if (newMileage < mileagePassed) {

            diff = mileagePassed - newMileage;
            multiplyChange = diff / 10000;
            this.currentPrice = currentPrice + Math.round(multiplyChange) * 300;
            this.mileagePassed = newMileage;
        }
    }

    public void printMainAttributes() {

        System.out.println("Model automobila je: " + this.model);
        System.out.println("Maksimalan kapaciitet rezervoara je: " + this.maxFuel);
        System.out.println("Trenutno je u rezervoaru: " + this.currentFuel);
        System.out.println("Predjena kilometraza je: " + this.mileagePassed);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println(" ");

    }

    public void printAttributes() {

        System.out.println("Maksimalna brzina: " + this.maxSpeed);
        System.out.println("Minimalna brzina: " + this.minSpeed);
        System.out.println("Tezina automobila je: " + this.weight);
        System.out.println("Registracija je: " + this.license);
        System.out.println("Cena automobila je: " + this.currentPrice);
        System.out.println("Predjena kilometraza je: " + this.mileagePassed);
        System.out.println(" ");

    }

    public void changeModel(String customModel) {
        this.model = customModel;
    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }

    public void changeConsumptio(int customConsumption) {
        this.consumption = customConsumption;
    }

    public void travel(int distance) {

        if (this.currentFuel > distance * this.consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
        } else {
            System.out.println("There is no enough fuel.");
        }

    }
}
