package Units;

import java.util.ArrayList;

public class Wizard extends Magic {

    public Wizard(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 17, 12, new int[] { -5,-5 }, 30, 9, x, y, 0, gangSize, 30, 1);
    }
}
