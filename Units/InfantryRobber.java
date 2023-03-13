package Units;

public class InfantryRobber extends Infantry {

    public InfantryRobber() {
        super(60, 15, 8);
    }

    @Override
    public String getInfo() {
        return "Robber";
    }
}
