package car;

public class Main {
    public static void main(String[] args) {

        Antique aceBristol = new Antique(" 23 March", 1955, "Germany",
                "blue", 99, "diesel", "manual", 4);

        Convertible fiat500 = new Convertible(333333, "Italy", "white", 249,
                "petrol", "automatic", 249);

        Leopard leopard = new Leopard("Jack", 3, "leopard", 55);

        aceBristol.makeSound();
        fiat500.makeSound();
        leopard.makeSound();

        System.out.println("Fuel type: " + fiat500.getFuelType());
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
    }
}
