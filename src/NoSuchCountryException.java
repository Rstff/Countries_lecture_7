
public class NoSuchCountryException extends Exception {
    public NoSuchCountryException(final String ruName) {
        super("Страны '" + ruName + "' не существует");

    }
}
