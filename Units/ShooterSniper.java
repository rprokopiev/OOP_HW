package Units;

public class ShooterSniper extends Shooter {

    public ShooterSniper(int x, int y) {
        super(12, 10, 8,10, 15, 15, 9, x, y, 32);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }

}
