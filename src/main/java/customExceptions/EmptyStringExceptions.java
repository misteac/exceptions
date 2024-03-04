package customExceptions;

public class EmptyStringExceptions extends RuntimeException {
    public EmptyStringExceptions (String msg) {
        super(msg);
    }

}
