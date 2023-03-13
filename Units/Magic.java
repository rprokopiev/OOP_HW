package Units;

public abstract class Magic extends BaseUnit {
    protected int magicDamage;
    protected int magicQty;

    public Magic(int hp, int hitDamage, int speed, int magicDamage, int magicQty) {
        super(hp, hitDamage, speed);
        this.magicDamage = magicDamage;
        this.magicQty = magicQty;
    }
}
