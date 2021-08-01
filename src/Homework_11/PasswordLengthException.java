package Homework_11;

public class PasswordLengthException extends Exception {

    private int length;

    public int getLength() {
        return length;
    }

    PasswordLengthException(String message, int length) {
        super(message);
        this.length = length;
    }
}
