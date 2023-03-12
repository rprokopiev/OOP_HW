package Units;

public class Infantry extends BaseUnit {

    public Infantry(int hp, int hitDamage, int speed) {
        super(hp, hitDamage, speed);
    }
    
    public String getInfantryInfo(){
        return String.format("%s", super.getInfo());
    }
}
