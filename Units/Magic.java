package Units;

import java.util.ArrayList;

public abstract class Magic extends BaseUnit {
    protected int magicQty;

    public Magic(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, float health, int magicQty) {
        super(name, attack, defence, damage, hpMax, speed, x, y, supply, gangSize, health);
        this.magicQty = magicQty;
    }


}
