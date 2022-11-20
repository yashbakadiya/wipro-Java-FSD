package exp.abstractdemo;

public class Car extends Vehicle {

    private String brand;

    public Car(String vehicleNumber, String brand) {
        super(vehicleNumber);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


    @Override
    public void move() {
        System.out.println(getVehicleNumber()+" moves like a car");
    }
}
