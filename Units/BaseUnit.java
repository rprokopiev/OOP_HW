package Units;

/**
 * BaseUnit - the basement unit class
 */
public abstract class BaseUnit implements BaseInterface {
    protected int hp;
    protected int hitDamage;
    protected int speed;

    public BaseUnit(int hp, int hitDamage, int speed) {
        this.hp = hp;
        this.hitDamage = hitDamage;
        this.speed = speed;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void step() {}
}