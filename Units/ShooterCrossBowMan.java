package Units;

public class ShooterCrossBowMan extends Shooter {

    public ShooterCrossBowMan() {
        super(70, 10, 5, 18, 80);
    }

    @Override
    public String getInfo() {
        return "CrossBowMan";
    }
    
}
