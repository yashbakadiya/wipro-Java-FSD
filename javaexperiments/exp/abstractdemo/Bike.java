package exp.abstractdemo;

public class Bike extends Vehicle {

    private String brand;

    public Bike(String vehicleNumber, String brand) {
        super(vehicleNumber);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    void move() {
        System.out.println(getVehicleNumber()+"moves like a bike");
    }
}
