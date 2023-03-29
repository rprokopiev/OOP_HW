package Units;

import java.util.ArrayList;

public abstract class Magic extends BaseUnit {
    protected int magicQty;

    public Magic(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, int health, int magicQty) {
        super(name, attack, defence, damage, hpMax, speed, x, y, supply, gangSize, health);
        this.magicQty = magicQty;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> homeTeam) {
        if (this.health > 0 && this.magicQty > 0) {
            float hp = 1;
            for (BaseUnit baseUnit : homeTeam) {
                if (baseUnit.health > 0 && (float) baseUnit.health / baseUnit.hpMax < hp) {
                    hp = baseUnit.health / baseUnit.hpMax;
                }
            }
            for (BaseUnit baseUnit : homeTeam) {
                if ((float) baseUnit.health / baseUnit.hpMax == hp) {
                    this.attack(baseUnit);
                    if (baseUnit.health > baseUnit.hpMax) {
                        baseUnit.health = baseUnit.hpMax;
                        this.magicQty = this.magicQty - 1;
                        return;
                    }
                }
            }
        } else
            return;
    }
}
