import java.util.ArrayList;

import Units.BaseUnit;
import Units.InfantryCountryMan;
import Units.InfantryRobber;
import Units.InfantrySpearman;
import Units.MagicMagician;
import Units.MagicWizard;
import Units.ShooterCrossBowMan;
import Units.ShooterSniper;

public class Programm {
    public static void main(String[] args) {
        ArrayList <BaseUnit> team1 = new ArrayList<>();
        team1.add(new InfantryCountryMan());
        team1.add(new InfantryCountryMan());
        team1.add(new InfantryRobber());
        team1.add(new InfantryRobber());
        team1.add(new InfantrySpearman());
        team1.add(new InfantrySpearman());
        team1.add(new MagicMagician());
        team1.add(new MagicWizard());
        team1.add(new ShooterCrossBowMan());
        team1.add(new ShooterSniper());

        
        ArrayList <BaseUnit> team2 = new ArrayList<>();
        team2.add(new InfantryCountryMan());
        team2.add(new InfantryCountryMan());
        team2.add(new InfantryRobber());
        team2.add(new InfantryRobber());
        team2.add(new InfantrySpearman());
        team2.add(new InfantrySpearman());
        team2.add(new MagicMagician());
        team2.add(new MagicWizard());
        team2.add(new ShooterCrossBowMan());
        team2.add(new ShooterSniper());

        for (int i = 0; i < team1.size(); i++) {
            System.out.print(team1.get(i).getInfo() + " ");
        }
        System.out.println();
        for (int i = 0; i < team2.size(); i++) {
            System.out.print(team2.get(i).getInfo() + " ");
        }
    }
}
