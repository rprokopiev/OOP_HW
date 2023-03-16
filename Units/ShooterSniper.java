package Units;

public class ShooterSniper extends Shooter {

    public ShooterSniper() {
        super(12, 10, 8,10, 15, 15, 9, 32);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }

}
