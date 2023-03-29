package Units;

import java.util.ArrayList;

public abstract class Infantry extends BaseUnit {

    public Infantry(ArrayList<BaseUnit> name, int attack, int defence,
            int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, int health) {
        super(name, attack, defence, damage, hpMax,
                speed, x, y, supply, gangSize, health);
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> homeTeam) {
        ArrayList<BaseUnit> both = new ArrayList<>();
        both.addAll(enemy);
        both.addAll(homeTeam);
        if (this.health > 0) {
            if (findClosest(enemy) != null) {
                for (int i = 0; i < this.speed; i++) {
                    if (this.position.getDistance(findClosest(enemy)) == 1){
                        this.attack(findClosest(enemy));
                        return;
                    }
                    else{
                        this.position.move(enemy, findClosest(enemy));
                    }
                }
            } else return;
        } else return;
    }
}
