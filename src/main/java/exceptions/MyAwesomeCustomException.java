package exceptions;

public class MyAwesomeCustomException extends RuntimeException {

    public MyAwesomeCustomException(String errorMessage) {
        super(errorMessage);
    }

}
