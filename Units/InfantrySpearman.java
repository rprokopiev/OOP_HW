package Units;

public class InfantrySpearman extends Infantry {

    public InfantrySpearman() {
        super(4, 5, 1, 3, 10, 10, 4, 0);
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }

}
