package Units;

import java.util.ArrayList;

public class Sniper extends Shooter {

    public Sniper(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 12, 10, new int[] { 8, 10 }, 15, 9, x, y, 0, gangSize, 10, 32);
    }
}
