package Units;

public class InfantrySpearman extends Infantry {

    public InfantrySpearman(int x, int y) {
        super(4, 5, 1, 3, 10, 10, 4, x, y, 0);
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }

}
