package Units;

public class MagicWizard extends Magic {

    public MagicWizard(int x, int y) {
        super(17, 12, -5, -5, 30, 30, 9, x, y, 1);
    }

    @Override
    public String getInfo() {
        return "Wizard";
    }

}
