package Units;

public abstract class Infantry extends BaseUnit {
    protected int load;

    public Infantry(int atack, int defence, int minDamage, int maxDamage, int hp, int hpMax, int speed, int load) {
        super(atack, defence, minDamage, maxDamage, hp, hpMax, speed);
        this.load = load;
    }
    
    public int getLoad() {
        return load;
    }
}
