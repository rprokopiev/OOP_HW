package Units;

import java.util.ArrayList;

public class Robber extends Infantry {

    public Robber(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 8, 3, new int[] { 2,4 }, 10, 6, x, y, 0, gangSize, 10);
    }
}
