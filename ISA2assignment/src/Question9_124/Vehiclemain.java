
package Question9_124;

public class Vehiclemain {
    public static void main(String[] args) {
       
        Car car = new Car(80, "Toyota");
        car.drive();
    }
}

class Vehicle {
    private int horsepower;

    
    public Vehicle(int horsepower) {
        this.horsepower = horsepower;
    }

   
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    private String make;
    private int horsepower;

   
    public Car(int horsepower, String make) {
        super(horsepower); 
        this.make = make;
        this.horsepower = 80; 
    }

    
    @Override
    public void drive() {
        super.drive(); 
        System.out.println("Car is being driven.");
    }
}

