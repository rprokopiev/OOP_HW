import java.util.ArrayList;
import java.util.Comparator;

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
        team2.add(new MagicWizard());
        team2.add(new InfantryCountryMan());
        team2.add(new InfantryRobber());
        team2.add(new InfantryRobber());
        team2.add(new InfantrySpearman());
        team2.add(new InfantrySpearman());
        team2.add(new MagicMagician());
        team2.add(new ShooterCrossBowMan());
        team2.add(new ShooterSniper());
        
        ArrayList <BaseUnit> sortedTeams = new ArrayList<>();
        sortedTeams.addAll(team1);
        sortedTeams.addAll(team2);

        sortedTeams.sort(new Comparator<BaseUnit>(){
            @Override
            public int compare(BaseUnit u1, BaseUnit u2){
                if(u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() > u2.getSpeed())
                    return 1;
                else return -1;
            }
        });
        
        team1.forEach(t -> t.step(team2,team1));
        PrintList(team2);
    }

    private static void PrintList(ArrayList <BaseUnit> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getHp() + " ");
        }
    }

}
