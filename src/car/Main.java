package car;

public class Main {
    public static void main(String[] args) {

        Car panamera = new Car("Germany", "black", 315,
                "petrol", "automatic", 5);

        Antique aceBristol = new Antique(" 23 March", 1955, "Germany",
                "blue", 99, "diesel", "manual", 4);

        Convertible fiat500 = new Convertible(100345,"Italy", "white", 166,
                "diesel", "automatic", 5);

        System.out.println("Colour: " + panamera.getColour());
        panamera.setMaxSpeed(100);
        System.out.println("Max.speed: " + panamera.getMaxSpeed());
        panamera.setMaxSpeed(450);
        panamera.setTransmissionType("manual");
        System.out.println("Transmission type: " + panamera.getTransmissionType());
        panamera.setTransmissionType("something");
        panamera.setSeatingCapacity(188);
        panamera.setFuelType("diesel");
        System.out.println("Fuel type: " + panamera.getFuelType());
        panamera.setFuelType("water");

        panamera.makeSound();
        fiat500.makeSound();
        aceBristol.makeSound();

        System.out.println("Fuel type: " + fiat500.getFuelType());
        fiat500.setPrice(45000000);
        fiat500.setPrice(345000);
        System.out.println("The price for this car is " + fiat500.getPrice());
        System.out.println("Max.speed: " + fiat500.getMaxSpeed());

        System.out.println(aceBristol.whenWasThisMade(1973, "11 February"));
        System.out.println(aceBristol.whenWasThisMade("30 July", 1959));

    }
}
