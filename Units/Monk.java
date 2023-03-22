package Units;

import java.util.ArrayList;

public class Monk extends Magic {

    public Monk(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 12, 7, new int[] { -4,-4 }, 30, 5, x, y, 0, gangSize, 30, 1);
    }
}
