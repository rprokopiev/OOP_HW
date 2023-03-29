import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Units.Arbalester;
import Units.BaseUnit;
import Units.Lancer;
import Units.Monk;
import Units.Peasant;
import Units.Robber;
import Units.Sniper;
import Units.Wizard;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseUnit> whiteSide;
    public static ArrayList<BaseUnit> darkSide;

    public static ArrayList<BaseUnit> allUnits;

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            makeStep();
            scanner.nextLine();
        }
    }

    private static void init() {
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        allUnits = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant(whiteSide, x, y++, GANG_SIZE));
                    break;
                case 1:
                    whiteSide.add(new Robber(whiteSide, x, y++, GANG_SIZE));
                    break;
                case 2:
                    whiteSide.add(new Sniper(whiteSide, x, y++, GANG_SIZE));
                    break;
                default:
                    whiteSide.add(new Monk(whiteSide, x, y++, GANG_SIZE));
                    break;
            }
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new Peasant(darkSide, x, y++, GANG_SIZE));
                    break;
                case 1:
                    darkSide.add(new Lancer(darkSide, x, y++, GANG_SIZE));
                    break;
                case 2:
                    darkSide.add(new Arbalester(darkSide, x, y++, GANG_SIZE));
                    break;
                default:
                    darkSide.add(new Wizard(darkSide, x, y++, GANG_SIZE));
                    break;
            }
        }
        allUnits.addAll(whiteSide);
        allUnits.addAll(darkSide);
    }

    private static void makeStep() {
        ArrayList<BaseUnit> sortedTeams = new ArrayList<>();
        sortedTeams.addAll(whiteSide);
        sortedTeams.addAll(darkSide);

        sortedTeams.sort(new Comparator<BaseUnit>() {
            @Override
            public int compare(BaseUnit u1, BaseUnit u2) {
                if (u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() < u2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });
        for (BaseUnit unit : sortedTeams) {
            if (whiteSide.contains(unit)) {
                unit.step(darkSide, whiteSide);
            } else {
                unit.step(whiteSide, darkSide);
            }
            // System.out.print(unit.getName() + '/' + unit.getHealth() + " | ");
        }
    }
}
