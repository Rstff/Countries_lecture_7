import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        for (Country oneCountry : Country.values()) {
            System.out.println(oneCountry);
        }
        Scanner scanner = new Scanner(System.in);
        String inputCountry = scanner.nextLine();
        boolean isFindEngName = true;

        try {
            Country findCountry = Country.valueOf(inputCountry);
            if (findCountry.isOpen()) {
                System.out.println("Страна [" + findCountry
                        + "] открыта для посещения.");
            } else {
                System.out.println("Страна [" + findCountry
                        + "] закрыта для посещения.");
            }
            isFindEngName = false;

        } catch (IllegalArgumentException iae) {
            System.out.println("Наименование страны на английском введено некорректно,"
                    + System.lineSeparator() + "проверяем русское название...");
        } catch (NullPointerException npe) {
            System.out.println("Не задано название страны");
        }
        if (isFindEngName) {
            try {
                Country findCountry = Country.getByRuName(inputCountry);
                if (findCountry.isOpen()) {
                    System.out.println("Страна [" + findCountry
                            + "] открыта для посещения.");
                } else {
                    System.out.println("Страна [" + findCountry
                            + "] закрыта для посещения.");
                }
            } catch (NoSuchCountryException e) {
                System.out.println("Страны '" + inputCountry + "' не существует");
            }
        }

    }
}
