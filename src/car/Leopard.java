package car;

import java.util.Scanner;

public class Leopard implements Movable {
    private static final int MAX_ALLOWED_SPEED = 70;
    private int maxSpeed;
    private final Scanner scanner = new Scanner(System.in);

    public Leopard (String name, int age, String colour, int maxSpeed){
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
        System.out.println("R-r-rrr");
    }

    public void setMaxSpeed(int speedChange) {
        if (speedChange > MAX_ALLOWED_SPEED) {
            this.maxSpeed = MAX_ALLOWED_SPEED;
            System.out.println("Sorry, but your speed is more than allowed one");
        } else {
            this.maxSpeed = speedChange;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
