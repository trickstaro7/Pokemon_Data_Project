import java.util.*;
public class Main
    {
        public static void main(String[] args) 
        {
            Information i = new Information();
            Simulation s = new Simulation();
            Comparisons comp = new Comparisons();
            Scanner userInput = new Scanner(System.in);
            System.out.println("     The Pokemon Generation 1 Pokedex and battle simulator! ");
            System.out.println();
            System.out.println("Press 1 to access the battle simualator");
            System.out.println();
            System.out.println("Press 2 to see all pokemon of a REQUESTED type");
            System.out.println();
            System.out.println("Press 3 to see the TYPE of a SPECIFIC pokemon");
            System.out.println();
            System.out.println("Press 4 to get the NUMBER of a SPECIFIC pokemon");
            System.out.println();
            System.out.println("Press 5 to COMPARE the SPEEDS of TWO Pokemon");
            System.out.println();
            System.out.println("Press 6 to COMPARE the ATTACK stats of TWO Pokemon");
            System.out.println();
            System.out.println("Press 7 to compare the HP stats of TWO pokemon");
            System.out.println();
            System.out.println("Press 8 to compare the DEFENSE stats of TWO pokemon");
            System.out.println();
            System.out.println("Press 9 to compare the HEIGHT of TWO Pokemon");
            System.out.println();
            System.out.println("Press 10 to compare the WEIGHT of TWO pokemon");
            System.out.println();
            System.out.println("Press 11 to see the chance of your pokemon being MALE");
            System.out.println();
            System.out.println("Press 12 to see the chance of your pokemon being FEMALE");
            System.out.println();
            System.out.println("Press 13 to see the capture rate of your pokemon");
            System.out.println();
            System.out.println("Press 14 to see the special attack stat of your Pokemon");
            System.out.println();
            System.out.println("Press 15 to see if your pokemon is weak to fire");
            System.out.println();
            System.out.println("Press 16 to see if your pokemon is weak to water");
            System.out.println();
            System.out.println("Press 17 to see if your pokemon is weak to electric");
            System.out.println();
            System.out.println("Press 18 to see if your pokemon is weak to grass");
            System.out.println();
            System.out.println("Press 19 to see if your pokemon is weak to ice");
            System.out.println();
            System.out.println("Press 20 to see if your pokemon is weak to fighting");
            System.out.println();
            System.out.println("Press 21 to see if your pokemon is weak to flying");
            System.out.println();
            System.out.println("Press 22 to see if your pokemon is weak to poison");
            System.out.println();
            System.out.println("Press 23 to see if your pokemon is weak to psychic");
            System.out.println();
            System.out.println("Press 24 to see if your pokemon is weak to bug");
            System.out.println();
            System.out.println("Press 25 to see if your pokemon is weak to rock");
            System.out.println();
            System.out.println("Press 26 to see if your pokemon is weak to ghost");
            System.out.println();
            System.out.println("Press 27 to see if your pokemon is weak to dragon");


            int dexOrGame = userInput.nextInt();

            if(dexOrGame == 1)
            {
                s.spAttDefSimulator();
            }
            if(dexOrGame == 2)
            {
                i.typeSort();
            }
            if(dexOrGame == 3)
            {
                System.out.print(i.getTypeOf());
            }
            if(dexOrGame == 4)
            {
                System.out.print(i.getNum());
            }

            if(dexOrGame == 5)
            {
                System.out.print(comp.speedCompareDuo());
            }
            if(dexOrGame == 6)
            {
                System.out.print(comp.attackCompareDuo());
            }
            if(dexOrGame == 7)
            {
                System.out.print(comp.hpDuoComparison());
            }
            if(dexOrGame == 8)
            {
                System.out.print(comp.defComparisonDuo());
            }
            if(dexOrGame == 9)
            {
                System.out.print(comp.heightComparisonDuo());
            }
            if(dexOrGame == 10)
            {
                System.out.print(comp.weightComparisonDuo());
            }
            if(dexOrGame == 11)
            {
                System.out.print(i.malePercent());
            }
            if(dexOrGame == 12)
            {
                System.out.print(i.femalePercent());
            }
            if(dexOrGame == 13)
            {
                System.out.print(i.captureRate());
            }
            if(dexOrGame == 14)
            {
                System.out.print(i.getSpecialAttack());
            }
            if(dexOrGame == 15)
            {
                System.out.print(i.weakToFire());
            }
            if(dexOrGame == 16)
            {
                System.out.print(i.weakToWater());
            }
            if(dexOrGame == 17)
            {
                System.out.print(i.weakToElectric());
            }
            if(dexOrGame == 18)
            {
                System.out.print(i.weakToGrass());
            }
            if(dexOrGame == 19)
            {
                System.out.print(i.weakToIce());
            }
            if(dexOrGame == 20)
            {
                System.out.print(i.weakToFighting());
            }
            if(dexOrGame == 21)
            {
                System.out.print(i.weakToFlying());
            }
            if(dexOrGame == 22)
            {
                System.out.print(i.weakToPoison());
            }
            if(dexOrGame == 23)
            {
                System.out.print(i.weakToPsychic());
            }
            if(dexOrGame == 24)
            {
                System.out.print(i.weakToBug());
            }
            if(dexOrGame == 25)
            {
                System.out.print(i.weakToRock());
            }
            if(dexOrGame == 26)
            {
                System.out.print(i.weakToGhost());
            }
            if(dexOrGame == 27)
            {
                System.out.print(i.weakToDragon());
            }
            else if (dexOrGame > 27 || dexOrGame < 1)
            {
                System.out.print("That number is invalid. Relaunch this program and try again");
            }

        }


    }