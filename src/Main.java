
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.printMainAttributes();

        Car companyCar = new Car(150, 30, 2000, false, "AB-554", 'B', 3500, 75000);
        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeConsumptio(10);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed + " km/h.");
        companyCar.travel(10);
        companyCar.printMainAttributes();

        companyCar.printMainAttributes();

        companyCar.changeMileage(85000);
        System.out.println(companyCar.mileagePassed);
        System.out.println(companyCar.currentPrice);

        myCar.changeMileage(35000);
        System.out.println(myCar.mileagePassed);
        System.out.println(myCar.currentPrice);

        Car jenniesCar = new Car();

        jenniesCar.changeMileage(10000);
        System.out.println("Cena je: " + jenniesCar.currentPrice);

        Car audi = new Car();
        audi.changeModel("Audi");
        audi.fuelUp();
        audi.changeConsumptio(5);
        audi.travel(15);

        audi.printMainAttributes();
        audi.getIn();
        audi.printMainAttributes();
        audi.getIn();
        audi.printMainAttributes();
        audi.getIn();
        audi.printMainAttributes();

        Car testAuto = new Car();
        testAuto.changeMaxPassenges(9);
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();

    }

}
