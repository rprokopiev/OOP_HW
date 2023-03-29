package Units;

import java.util.ArrayList;

public class Lancer extends Infantry {

    public Lancer(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 4, 13, new int[] { 2,3 }, 15, 4, x, y, 0, gangSize, 15);
    }
}
