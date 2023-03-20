package Units;

public class MagicMagician extends Magic {
    public MagicMagician(int x, int y) {
        super(12, 7, -4, -4, 30, 30, 5, x, y, 1);
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

}
