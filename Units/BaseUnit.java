package Units;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * BaseUnit - the basement unit class
 */
public abstract class BaseUnit implements BaseInterface {
    public ArrayList<BaseUnit> name;
    protected int attack, defence, hpMax, supply, gangSize;
    protected int health;
    protected int speed;
    protected int[] damage;
    protected Vector2 position;
    public String type;
    private BaseUnit getter;

    public BaseUnit(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, 
            int x, int y, int supply, int gangSize, int health) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.hpMax = hpMax;
        this.supply = 0;
        this.gangSize = gangSize;
        this.health = health;
        this.speed = speed;
        this.damage = damage;
        this.position = new Vector2(x, y);
        this.type = this.getClass().getName().split("\\.")[1];
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\tA%-3d\t\uD83D\uDEE1 %-3d\tH%-3d%%-3d%%\tD%-3d\t", type, attack, defence, health * 100/hpMax,(damage[0] + damage[1])/2);
        return outStr;
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> homeTeam) {
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + getInfo() + ", Attack: " + attack + ", Defence: "
                + defence + ", Damage: " + Arrays.toString(damage) + ", Health: "
                + health + ", Speed: " + speed;
    }

    @Override
    public String getName() {
        return this.getClass().getName().split("\\.")[1];
    }

    public Vector2 getPosition() {
        return position;
    }

    public int getSpeed() {
        return speed;
    }

    public int getattach() {
        return attack;
    }

    public int getHealth() {
        return (int) health;
    }

    public int getSupply() {
        return this.supply;
    }
    // атака с учётом разницы в размере атаки и защиты:
    @Override
    public void attack(BaseUnit toAttack) {
        if (this.attack > toAttack.defence){
            toAttack.health = toAttack.health - this.damage[1];
            if (toAttack.health <=0) toAttack.health = 0;
        }
        else {
            toAttack.health = toAttack.health - this.damage[0];
            if (toAttack.health <=0) toAttack.health = 0;
        }
    }

    // поиск живого участника с минимальным рассотянием
    @Override
    public BaseUnit findClosest(ArrayList <BaseUnit> enemy) {
        BaseUnit tmp = null;
        double minDistance = 100;
        for (BaseUnit baseUnit : enemy) {
            if (baseUnit.health > 0 && this.position.getDistance(baseUnit) < minDistance) {
                minDistance = this.position.getDistance(baseUnit);
                tmp = baseUnit;
            }
        }
        return tmp;
    }
}