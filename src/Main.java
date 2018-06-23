
import loops.Loops;
import person.Person;
import person.Student;
import person.Teacher;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//
//        myCar.printMainAttributes();
//
//        Car companyCar = new Car(150, 30, 2000, false, "AB-554", 'B', 3500, 75000);
//        companyCar.changeModel("Fiat");
//        companyCar.changeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsumptio(10);
//        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed + " km/h.");
//        companyCar.travel(10);
//        companyCar.printMainAttributes();
//
//        companyCar.printMainAttributes();
//
//        companyCar.changeMileage(85000);
//        System.out.println(companyCar.mileagePassed);
//        System.out.println(companyCar.currentPrice);
//
//        myCar.changeMileage(35000);
//        System.out.println(myCar.mileagePassed);
//        System.out.println(myCar.currentPrice);
//
//        Car jenniesCar = new Car();
//
//        jenniesCar.changeMileage(10000);
//        System.out.println("Cena je: " + jenniesCar.currentPrice);
//
//        Car audi = new Car();
//        audi.changeModel("Audi");
//        audi.fuelUp();
//        audi.changeConsumptio(5);
//        audi.travel(15);
//
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        Car testAuto = new Car();
//        testAuto.changeMaxPassengers(5);
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();
        //Loops testLoop = new Loops();
        
//        Loops.testWhileLoop();
//        Loops.testDoWhileLoop();
//        Loops.testForLoop();
//        Loops.testDoubleForLoop();
//        Loops.testMultiplicationTable();

        Person p1 = new Person();
        Person p2 = new Person("Holy", "Henderson", "2255466884");
        
        p1.showData();
        
        p1.setName("John");
        p1.setSurname("Doe");
        p1.setJmbg("2205993552265");
        p1.showData();
        
        p2.showData();
        
        Student studentJovan = new Student("Jovan", "Peric", "1105998502122");
        
        studentJovan.setCurrentYear(2);
        studentJovan.setIndexNumber("18/10");
        
        studentJovan.showData();
        
        Student studentMarija = new Student("Marija", "Samardzic", "220544581166", "22/10", 3);
        studentMarija.showData();
        
        Teacher t1 = new Teacher("Marry", "Johnson", "2288797552255", 15, "English");
        t1.showData();
      }

}
