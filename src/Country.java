public enum Country {
    THAILAND("Таиланд", false),
    GERMANY("Германия", true),
    RUSSIA("Россия", true),
    USA("Америка", false);
    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public String toString() {
        return name() + " " + "(" + ruName + ")";
    }

    static Country getByRuName(final String ruName) throws NoSuchCountryException {

        for (Country findCountry : values()) {
            if (findCountry.ruName.equals(ruName)) {
                return findCountry;
            }
        }
        throw new NoSuchCountryException(ruName);
    }
}