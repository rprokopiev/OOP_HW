package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit {
    protected int arrowQty;

    public Shooter(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, int x, int y,
            int supply, int gangSize, float health, int arrowQty) {
        super(name, attack, defence, damage, hpMax, speed, x, y, supply, gangSize, health);
        this.arrowQty = arrowQty;
    }



    // @Override
    // public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> homeTeam) {
    //     if (this.arrowQty > 0 && this.hp > 0) {
    //         System.out.println(this.getInfo() + " is ready to shoot");
    //         BaseUnit tmp = null;
    //         double minDistance = 13; // значение, выше максимально возможного расстояние между юнитами.
    //         // находим живого участника с минимальным рассотянием:
    //         for (BaseUnit baseUnit : team) {
    //             if (baseUnit.hp != 0 && this.position.getDistance(baseUnit) < minDistance) {
    //                 minDistance = this.position.getDistance(baseUnit);
    //                 tmp = baseUnit;
    //             }
    //         }
    //         if (minDistance == 13) // выход если живого участника нет (не измелась переменная minDistance)
    //             return;
    //         System.out.println(this.getInfo() + " attacks " + tmp.getInfo());
    //         System.out.println(tmp.getInfo() + " had " + tmp.hp + " HP");

    //         // атака с учётом размера разницы в размере атаки и защиты:
    //         if (this.atack > tmp.defence) {
    //             tmp.hp = tmp.hp - this.maxDamage;
    //         } else {
    //             tmp.hp = tmp.hp - this.minDamage;
    //         }

    //         // обнуление значения hp в случае нулевого или отрицательного значения hp
    //         if (tmp.hp <= 0) {
    //             tmp.hp = 0;
    //             System.out.println(tmp.getInfo() + " is died");
    //         } else
    //             System.out.println(tmp.getInfo() + " has " + tmp.hp + "HP now");

    //         // уменьшение кол-ва стрел поиск крестьянина со стрелами
    //         this.arrowQty = this.arrowQty - 1;
    //         for (BaseUnit baseUnit : homeTeam) {
    //             if (baseUnit.getInfo() == "CountryMan" && baseUnit.getData() != 0) {
    //                 this.arrowQty++;
    //             }
    //         }
    //         return;
    //     }
    // }
}
