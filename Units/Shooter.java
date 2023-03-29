package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit {
    protected int arrowQty;

    public Shooter(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, int health, int arrowQty) {
        super(name, attack, defence, damage, hpMax, speed, x, y, supply, gangSize, health);
        this.arrowQty = arrowQty;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemyTeam, ArrayList<BaseUnit> homeTeam) {
        if (this.health > 0 && this.arrowQty > 0) {
            if (findClosest(enemyTeam) != null) {
                this.attack(findClosest(enemyTeam));
            } else
                return;
        } else
            return;
        this.arrowQty = this.arrowQty - 1;
        for (BaseUnit baseUnit : homeTeam) {
            if (baseUnit.getName() == "P") {
                if (baseUnit.supply != 0) {
                    this.arrowQty += 1;
                    baseUnit.supply -= 1;
                }
            }
        }
    }
}
