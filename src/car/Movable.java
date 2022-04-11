package car;

public interface Movable {

    default String aboutObject() {
        return "yes, it can move";
    }

    void startTheMove();

    void makeSound();
}
