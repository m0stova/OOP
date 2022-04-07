package car;

public class Antique extends Car {
    private static final int maxAllowedSpeed = 110;
    private int year;
    private String date;

    public Antique(String date, int year, String country, String colour, int maxSpeed, String fuelType,
                   String transmissionType, int seatingCapacity) {
        super(country, colour, maxSpeed, fuelType, transmissionType, seatingCapacity);
        this.year = year;
        this.date = date;
    }

    @Override
    public void makeSound() {
        System.out.println("vroom-dr-vroom-dr!");
    }

    @Override
    public void setSeatingCapacity(int seatsChange) {
        if (seatsChange > maxSeatingCapacity) {
            System.out.println("If seating capacity is > 10, it's not a car anymore, it's a minibus");
        } else {
            this.seatingCapacity = seatsChange;
        }
    }

    @Override
    public void setMaxSpeed(int speedChange) {
        if (speedChange > maxAllowedSpeed) {
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