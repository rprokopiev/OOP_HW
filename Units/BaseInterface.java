package Units;

import java.util.ArrayList;

public interface BaseInterface {
    void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> homeTeam);

    String getInfo();
}
