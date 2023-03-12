package Units;

/**
 * BaseUnit - the basement unit class
 */
public class BaseUnit {
    protected int hp;
    protected int hitDamage;
    protected int speed;

    public BaseUnit(int hp, int hitDamage, int speed) {
        this.hp = hp;
        this.hitDamage = hitDamage;
        this.speed = speed;
    }

    public String getInfo(){
        return String.format("hp = %d, hitDamage = %d, speed = %d", 
            this.hp, this.hitDamage, this.speed);
    }
}