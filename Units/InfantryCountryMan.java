package Units;

public class InfantryCountryMan extends Infantry {
    public InfantryCountryMan() {
        super(1,1,1,1,1,1,3,1);
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
