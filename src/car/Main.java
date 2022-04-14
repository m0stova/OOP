package car;

public class Main {
    public static void main(String[] args) {

        Antique aceBristol = new Antique(" 23 March", 1955, "Germany",
                Colour.BLUE, 99, FuelType.DIESEL, TransmissionType.MANUAL, 4);

        Convertible fiat500 = new Convertible(333333, "Italy", Colour.WHITE, 249,
                FuelType.BIO_DIESEL, TransmissionType.AUTOMATIC, 249);

        Leopard leopard = new Leopard("Jack", 3, "leopard", 55);

        aceBristol.makeSound();
        fiat500.makeSound();
        leopard.makeSound();

        fiat500.setPrice(45000000);
        fiat500.setPrice(345000);
        System.out.println("The price for this car is " + fiat500.getPrice() + "$");
        System.out.println("fiat500's max.speed: " + fiat500.getMaxSpeed() + "km/h");

        System.out.println(aceBristol.whenWasThisMade(1973, "11 February"));
        System.out.println(aceBristol.whenWasThisMade("30 July", 1959));

        leopard.startTheMove();
        System.out.println("Can a leopard move?: " + leopard.aboutObject());
        leopard.setMaxSpeed(500);
        leopard.setMaxSpeed(35);
        System.out.println("Leopard's max.speed: " + leopard.getMaxSpeed() + "km/h");

        fiat500.setFuelType(FuelType.DIESEL);
        System.out.println("The fuel type: " + fiat500.getFuelType());
        fiat500.setTransmissionType(TransmissionType.CVT);
        System.out.println("The transmission type: " + fiat500.getTransmissionType());
        fiat500.setColour(Colour.BROWN);
        System.out.println("The colour of this car: " + fiat500.getColour());
        aceBristol.setFuelType(FuelType.ETHANOL);
        System.out.println("The fuel type: " + aceBristol.getFuelType());

    }
}
