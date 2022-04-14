package car;

public abstract class Car {
    private static final int MAX_ALLOWED_SPEED = 400;
    public static final int MAX_SEATING_CAPACITY = 10;
    protected int maxSpeed;
    private String colour;
    private final String country;
    protected FuelType fuelType;
    private String transmissionType;
    protected int seatingCapacity;
    protected FuelType fuelTypeVariation;


    public Car(String country, String colour, int maxSpeed, FuelType fuelType,
               String transmissionType, int seatingCapacity) {
        this.country = country;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.seatingCapacity = seatingCapacity;
    }

    public abstract void setFuelType(FuelType fuelTypeChange);

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int speedChange) {
        if (speedChange > MAX_ALLOWED_SPEED) {
            this.maxSpeed = MAX_ALLOWED_SPEED;
            System.out.println("Sorry, but your speed is more than allowed one");
        } else {
            this.maxSpeed = speedChange;
        }
    }

    public FuelType getFuelType() {
        return fuelType;
    }


    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionTypeChange) {
        if (transmissionTypeChange.equals("automatic") || transmissionTypeChange.equals("manual")
                || transmissionTypeChange.equals("CVT")) this.transmissionType = transmissionTypeChange;
        else {
            System.out.println("Wrong transmission type");
        }

    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatsChange) {
        if (seatsChange > MAX_SEATING_CAPACITY) {
            System.out.println("If seating capacity is > 10, it's not a car anymore, it's a minibus");
        } else {
            this.seatingCapacity = seatsChange;
        }
    }


}

