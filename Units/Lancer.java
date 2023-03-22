package Units;

import java.util.ArrayList;

public class Lancer extends Infantry {

    public Lancer(ArrayList<BaseUnit> name, int x, int y, int gangSize) {
        super(name, 4, 5, new int[] { 1,3 }, 10, 4, x, y, 0, gangSize, 10);
    }
}
