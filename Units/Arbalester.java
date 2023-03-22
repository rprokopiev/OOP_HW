package Units;

import java.util.ArrayList;

public class Arbalester extends Shooter {

    public Arbalester(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 6, 3, new int[] { 2, 3 }, 10, 4, x, y, 0, gangSize, 10, 16);
    }
}
