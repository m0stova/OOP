package car;

public class Convertible extends Car {
    private static final int maxAllowedSpeed = 200;
    private static final int minPrice = 1000;
    private static final int maxPrice = 40000000;
    private int price;

    public Convertible(int price, String country, String colour, int maxSpeed, String fuelType,
                       String transmissionType, int seatingCapacity) {
        super(country, colour, maxSpeed, fuelType, transmissionType, seatingCapacity);
        this.price = price;
    }
    @Override
    public int getMaxSpeed(){
        return super.getMaxSpeed();
    }

    @Override
    public void makeSound() {
        System.out.println("vroom-vroom");
    }

    @Override
    public String getFuelType() {
        return super.getFuelType();
    }

    @Override
    public void setMaxSpeed(int speedChange) {
        if (speedChange > maxAllowedSpeed) {
            System.out.println("Sorry, but your speed is more than allowed one");
        } else {
            this.maxSpeed = speedChange;
        }
    }
    public void setPrice(int priceChange) {
        if (priceChange < minPrice || priceChange > maxPrice) {
            System.out.println("This price is not allowed");
        } else {
            this.price = priceChange;
        }
    }
    public int getPrice() {
        return this.price;
    }
}

