package Units;

public abstract class Infantry extends BaseUnit {
    protected int load;


    
    public Infantry(int atack, int defence, int minDamage, int maxDamage, 
        int hp, int hpMax, int speed, int x, int y,int load) {
        super(atack, defence, minDamage, maxDamage, hp, hpMax, speed, x, y);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }
}
