package Units;

public class InfantryRobber extends Infantry {

    public InfantryRobber() {
        super(8, 3, 2, 4, 10, 10, 6, 0);
    }

    @Override
    public String getInfo() {
        return "Robber";
    }
}
