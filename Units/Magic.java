package Units;

public class Magic extends BaseUnit {
    protected int magicDamage;
    protected int magicQty;

    public Magic(int hp, int hitDamage, int speed, int magicDamage, int magicQty) {
        super(hp, hitDamage, speed);
        this.magicDamage = magicDamage;
        this.magicQty = magicQty;
    }

    public String getMagicInfo(){
        return String.format("%s, magicDamage = %d, magicQty = %d", 
            super.getInfo(), this.magicDamage, this.magicQty);
    }
}
