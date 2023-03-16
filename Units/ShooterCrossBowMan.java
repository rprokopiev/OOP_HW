package Units;

public class ShooterCrossBowMan extends Shooter {

    public ShooterCrossBowMan() {
        super(6, 3, 2, 3, 10, 10, 4, 16);
    }

    @Override
    public String getInfo() {
        return "CrossBowMan";
    }

}
