package Units;

public class Shooter extends BaseUnit {
    protected int arrowDamage;
    protected int arrowQty;

    public Shooter(int hp, int hitDamage, int speed, int arrowDamage, int arrowQty) {
        super(hp, hitDamage, speed);
        this.arrowDamage = arrowDamage;
        this.arrowQty = arrowQty;
    }

    public String getShooterInfo(){
        return String.format("%s, ArrowDamage = %d, ArrowQty = %d", 
            super.getInfo(), this.arrowDamage, this.arrowQty);
    }
}
