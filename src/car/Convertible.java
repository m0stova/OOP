package car;

import java.util.Scanner;

public class Convertible extends Car implements Movable {

    private static final int MAX_ALLOWED_SPEED = 200;
    private static final int MIN_PRICE = 1000;
    private static final int MAX_PRICE = 40000000;
    private int price;
    private final Scanner scanner = new Scanner(System.in);

    public Convertible(int price, String country, String colour, int maxSpeed, FuelType fuelType, String transmissionType,
                       int seatingCapacity) {
        super(country, colour, maxSpeed, fuelType, transmissionType, seatingCapacity);
        this.price = price;

    }

    @Override
    public void startTheMove() {
        System.out.print("Would you like to start the move? (1 - yes/0 - no): ");
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("The move is starting...");
        } else if (answer == 0) {
            System.out.println("Process stopped. Try again later!");
        }
    }


    @Override
    public void makeSound() {
        System.out.println("vroom-vroom");
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public FuelType getFuelType() {
        return super.getFuelType();
    }

    @Override
    public void setMaxSpeed(int speedChange) {
        if (speedChange > MAX_ALLOWED_SPEED) {
            System.out.println("Sorry, but your speed is more than allowed one");
        } else {
            this.maxSpeed = speedChange;
        }
    }

    public void setPrice(int priceChange) {
        if (priceChange < MIN_PRICE || priceChange > MAX_PRICE) {
            System.out.println("This price is not allowed");
        } else {
            this.price = priceChange;
        }
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public void setFuelType(FuelType fuelTypeChange) {
        this.fuelTypeVariation = fuelTypeChange;
        super.fuelType = fuelTypeChange;
        final String ANSWER = "The fuel type is: ";
        switch (fuelTypeVariation) {
            case DIESEL -> {
                System.out.println( ANSWER + "diesel");
                break;
            }
            case BIO_DIESEL -> {
                System.out.println(ANSWER + "bio-diesel");
                break;
            }
            case GASOLINE -> {
                System.out.println( ANSWER + "gasoline");
                break;
            }
            case ETHANOL -> {
                System.out.println(ANSWER + "ethanol");
                break;
            }
            default -> {
                System.out.println("Wrong fuel type!");
                break;
            }
        }

    }

}

