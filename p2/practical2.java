class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Number of doors: " + doors);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 120, 4);
        c.displayCar();
    }
}
