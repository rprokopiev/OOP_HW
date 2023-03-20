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
        // BaseUnit d = new InfantryCountryMan(0, 0);
        // BaseUnit c = new InfantryCountryMan(1, 9);
        // System.out.println(d.getPosition().getDistance(c));

        ArrayList <BaseUnit> team1 = new ArrayList<>();
        team1.add(new ShooterSniper(0,0));
        team1.add(new InfantryCountryMan(0,1));
        team1.add(new InfantryRobber(0,2));
        team1.add(new InfantryRobber(0,3)); 
        team1.add(new InfantrySpearman(0,4));
        team1.add(new InfantrySpearman(0,5));
        team1.add(new MagicMagician(0,6)); 
        team1.add(new MagicWizard(0,7));
        team1.add(new ShooterCrossBowMan(0,8));
        team1.add(new ShooterSniper(0,9));
        
        ArrayList <BaseUnit> team2 = new ArrayList<>();
        team2.add(new InfantryCountryMan(9,0));
        team2.add(new MagicWizard(9,1));
        team2.add(new InfantryCountryMan(9,2));
        team2.add(new InfantryRobber(9,3));
        team2.add(new InfantryRobber(9,4));
        team2.add(new InfantrySpearman(9,5));
        team2.add(new InfantrySpearman(9,6));
        team2.add(new MagicMagician(9,7));
        team2.add(new ShooterCrossBowMan(9,8));
        team2.add(new ShooterSniper(9,9));
        
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
