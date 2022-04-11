package car;

import java.util.Scanner;

public class Antique extends Car implements Movable{
    private static final int MAX_ALLOWED_SPEED = 110;
    private int year;
    private String date;
    static Scanner scanner = new Scanner(System.in);

    public Antique(String date, int year, String country, String colour, int maxSpeed, String fuelType,
                   String transmissionType, int seatingCapacity) {
        super(country, colour, maxSpeed, fuelType, transmissionType, seatingCapacity);
        this.year = year;
        this.date = date;
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
        System.out.println("vroom-dr-vroom-dr!");
    }

    @Override
    public void setSeatingCapacity(int seatsChange) {
        if (seatsChange > MAX_SEATING_CAPACITY) {
            System.out.println("If seating capacity is > 10, it's not a car anymore, it's a minibus");
        } else {
            this.seatingCapacity = seatsChange;
        }
    }

    @Override
    public void setMaxSpeed(int speedChange) {
        if (speedChange > MAX_ALLOWED_SPEED) {
            System.out.println("Sorry, but your speed is more than allowed one");
        } else {
            this.maxSpeed = speedChange;
        }
    }

    public String whenWasThisMade(int year, String date) {
        this.year = year;
        this.date = date;
        return "This car was made in " + year + " on  " + date;
    }

    public String whenWasThisMade(String date, int year) {
        this.year = year;
        this.date = date;
        return "This car was made in " + year + " on  " + date;
    }

}