package Units;

import java.util.ArrayList;

public abstract class Shooter extends BaseUnit {
    protected int arrowQty;

    public Shooter(int atack, int defence, int minDamage, int maxDamage, int hp, int hpMax, int speed, int arrowQty) {
        super(atack, defence, minDamage, maxDamage, hp, hpMax, speed);
        this.arrowQty = arrowQty;
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> homeTeam) {
        if (this.arrowQty > 0 && this.hp > 0) {
            System.out.println(this.getInfo() + " is ready to shoot");
            int hpDifference = 30; // максимально возожное здоровье
            BaseUnit tmp = null;

            // находим живого участника с минимальным здоровьем:
            for (BaseUnit baseUnit : team) { 
                if (baseUnit.hp != 0 && baseUnit.hpMax - baseUnit.hp < hpDifference) {
                    hpDifference = baseUnit.hpMax - baseUnit.hp;
                    tmp = baseUnit;
                }
            }
            if (hpDifference == 30) // выход если живого участника нет (не измелась переменная hpDifference)
                return;
            System.out.println(this.getInfo() + " attacks " + tmp.getInfo());
            System.out.println(tmp.getInfo() + " had " + tmp.hp + " HP");

            // атака с учётом размера разницы в размере атаки и защиты:
            if (this.atack > tmp.defence) {
                tmp.hp = tmp.hp - this.maxDamage; 
            } else {
                tmp.hp = tmp.hp - this.minDamage;
            }

            // обнуление значения hp в случае нулевого или отрицательного значения hp
            if (tmp.hp <= 0){
                tmp.hp = 0;
                System.out.println(tmp.getInfo() + " is died");
            }
            else
                System.out.println(tmp.getInfo() + " has " + tmp.hp + "HP now");

            // уменьшение кол-ва стрел поиск крестьянина со стрелами
            this.arrowQty = this.arrowQty-1;
            for (BaseUnit baseUnit : homeTeam) {
                if (baseUnit.getInfo() == "CountryMan" && baseUnit.getData() != 0){
                    this.arrowQty++;
                }
            }
            return;
        }
    }
}
