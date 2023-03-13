package Units;

public class ShooterSniper extends Shooter {

    public ShooterSniper() {
        super(60, 8, 6, 25, 50);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }
}
