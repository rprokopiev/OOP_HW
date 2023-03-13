package Units;

public class InfantryCountryMan extends Infantry {
    public InfantryCountryMan() {
        super(50, 10, 6);
    }

    @Override
    public String getInfo() {
        return "Infantry";
    }
}
