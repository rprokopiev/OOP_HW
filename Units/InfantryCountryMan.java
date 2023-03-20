package Units;

public class InfantryCountryMan extends Infantry {
    public InfantryCountryMan(int x, int y) {
        super(1, 1, 1, 1, 1, 1, 3, x, y, 1);
    }

    @Override
    public String getInfo() {
        return "CountryMan";
    }

    @Override
    public int getData() {
        return load;
    }
}
