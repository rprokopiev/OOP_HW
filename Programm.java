import Units.Infantry;
import Units.InfantryCountryMan;
import Units.InfantryRobber;
import Units.InfantrySpearman;
import Units.Magic;
import Units.MagicMagician;
import Units.MagicWizard;
import Units.Shooter;
import Units.ShooterCrossBowMan;
import Units.ShooterSniper;

public class Programm {
    public static void main(String[] args) {
        Infantry countryMan = new InfantryCountryMan();
        Infantry robber = new InfantryRobber();
        Infantry spearman = new InfantrySpearman();
        Magic magician = new MagicMagician();
        Magic wizard = new MagicWizard();
        Shooter crossbowman = new ShooterCrossBowMan();
        Shooter sniper = new ShooterSniper();
        System.out.println(countryMan.getInfantryInfo());
        System.out.println(robber.getInfo());
        System.out.println(spearman.getInfantryInfo());
        System.out.println(magician.getMagicInfo());
        System.out.println(wizard.getMagicInfo());
        System.out.println(crossbowman.getShooterInfo());
        System.out.println(sniper.getShooterInfo());
    }
}
