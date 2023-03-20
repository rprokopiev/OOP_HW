package Units;

public abstract class Magic extends BaseUnit {
    protected int magicQty;

    public Magic(int atack, int defence, int minDamage, int maxDamage, int hp, int hpMax, int speed, int x, int y,
            int magicQty) {
        super(atack, defence, minDamage, maxDamage, hp, hpMax, speed, x, y);
        this.magicQty = magicQty;
    }
}
