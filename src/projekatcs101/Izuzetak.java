package projekatcs101;

public class Izuzetak extends Exception {

    public Izuzetak() {
    }

    public Izuzetak(String message) {
        super(message);
    }

    public Izuzetak(String message, Throwable cause) {
        super(message, cause);
    }

    public Izuzetak(Throwable cause) {
        super(cause);
    }

    public Izuzetak(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
