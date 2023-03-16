package Units;

public abstract class Magic extends BaseUnit {
    protected int magicQty;

    public Magic(int atack, int defence, int minDamage, int maxDamage, int hp, int hpMax, int speed, int magicQty) {
        super(atack, defence, minDamage, maxDamage, hp, hpMax, speed);
        this.magicQty = magicQty;
    }
}
