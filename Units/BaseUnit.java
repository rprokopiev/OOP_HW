package Units;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * BaseUnit - the basement unit class
 */
public abstract class BaseUnit implements BaseInterface {
    public ArrayList<BaseUnit> name;
    protected int attack, defence, hpMax, supply, gangSize;
    protected float health;
    protected int speed;
    protected int[] damage;
    protected Vector2 position;
    public String type;

    public BaseUnit(ArrayList<BaseUnit> name, int attack, int defence, int[] damage, int hpMax, int speed, 
            int x, int y, int supply, int gangSize, float health) {
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
        String outStr = String.format("\t%-3s\tA%-3d\t\uD83D\uDEE1 %-3d\tH%-3d%%-3d%%\tD%-3d\t", type, attack, defence, (int)health * 100/hpMax,(damage[0] + damage[1])/2);
        return outStr;
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> homeTeam) {
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

    public int getHealth() {
        return (int) health;
    }
}