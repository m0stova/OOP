package car;

public abstract class Car {
    private static final int MAX_ALLOWED_SPEED = 400;
    public static final int MAX_SEATING_CAPACITY = 10;
    protected int maxSpeed;
    protected Colour colour;
    private final String country;
    protected FuelType fuelType;
    protected TransmissionType transmissionType;
    protected int seatingCapacity;
    protected FuelType fuelTypeVariation;
    protected TransmissionType transmissionTypeVariation;
    protected Colour colourVariation;


    public Car(String country, Colour colour, int maxSpeed, FuelType fuelType,
               TransmissionType transmissionType, int seatingCapacity) {
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

    public void setColour(Colour colourChange) {
        this.colourVariation = colourChange;
        switch (colourVariation) {
            case RED, WHITE, BLUE, GRAY, PINK, BLACK, BROWN, GREEN, ORANGE, YELLOW -> this.colour = colourChange;
            default -> System.out.println("Wrong colour!");
        }
    }


    public Colour getColour() {
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


    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionTypeChange) {
        this.transmissionTypeVariation = transmissionTypeChange;
        switch (transmissionTypeVariation){
            case AUTOMATIC,CVT,MANUAL -> this.transmissionType = transmissionTypeChange;
            default -> System.out.println("Wrong transmission type");
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

