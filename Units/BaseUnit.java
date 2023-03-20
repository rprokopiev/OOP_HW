package Units;

import java.util.ArrayList;

/**
 * BaseUnit - the basement unit class
 */
public abstract class BaseUnit implements BaseInterface {
    protected int atack;
    protected int defence;
    protected int minDamage;
    protected int maxDamage;
    protected int hp;
    protected int hpMax;
    protected int speed;
    protected Position position;

    public BaseUnit(int atack, int defence, int minDamage, 
                    int maxDamage, int hp, int hpMax, int speed, 
                    int x, int y) {
        this.atack = atack;
        this.defence = defence;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.hpMax = hpMax;
        this.speed = speed;
        position = new Position(x, y);
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public int getData() {
        return 0;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> homeTeam) {
        // System.out.println("base");
    }   

    
}