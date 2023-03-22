package Units;

import java.util.ArrayList;

public abstract class Infantry extends BaseUnit {

    public Infantry(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, float health) {
        super(name, attack, defence, damage, hpMax, speed, x, y, supply, gangSize, health);
    }


}
