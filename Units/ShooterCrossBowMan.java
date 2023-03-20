package Units;

public class ShooterCrossBowMan extends Shooter {

    public ShooterCrossBowMan(int x, int y) {
        super(6, 3, 2, 3, 10, 10, 4, x, y, 16);
    }

    @Override
    public String getInfo() {
        return "CrossBowMan";
    }

}
