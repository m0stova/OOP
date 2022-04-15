package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int input = 8;
        int output = fibonacciSequence(input);
        System.out.println("Result of the fibonacci sequence: "+ output);

    }

    public static int fibonacciSequence(int numberOfElements) {
        if (numberOfElements == 0) return 0;
        int temporaryNumberState1 = 0, temporaryNumberState2 = 1;
        for (int i = 2; i <= numberOfElements; i++) {
            int temporaryNumberState3 = temporaryNumberState1 + temporaryNumberState2;
            temporaryNumberState1 = temporaryNumberState2;
            temporaryNumberState2 = temporaryNumberState3;
        }
        return temporaryNumberState2;
    }
}
