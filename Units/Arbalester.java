package Units;

import java.util.ArrayList;

public class Arbalester extends Shooter {

    public Arbalester(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 6, 13, new int[] { 4, 6 }, 15, 4, x, y, 0, gangSize, 15, 16);
    }
}
