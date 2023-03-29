package Units;

import java.util.ArrayList;

public interface BaseInterface {
    void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> homeTeam);

    String getInfo();

    String getName();

    void attack(BaseUnit toAttach);

    BaseUnit findClosest(ArrayList <BaseUnit> enemy);
}
