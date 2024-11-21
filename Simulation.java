import java.util.*;
public class Simulation
{
    private ConvertToList cL = new ConvertToList();
    private Information info = new Information();
    private List<List<String>> fullDex = cL.dataPoint();
    private Scanner userInput = new Scanner(System.in);
    public Simulation()
    {

    }
    public int getSpecialAttack()
    {
        System.out.println("Enter in the name of the pokemon that you want to know the special attack of");
        String name = userInput.nextLine();
        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).toString().contains(name)) //check to see if object in index "i" has the pokemon name in there
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);

            if(name.contains(pokemonName))
            {
                String pokemonInfo = fullDex.get(i).toString();
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 16);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                int spAttack = Integer.parseInt(data);
                System.out.print(pokemonName + "'s special attack is: ");
                return spAttack;
            }
            }
        }
        System.out.print("This Pokemon does not exist in Generation ");
        return 1;
    }
    public int nthIndexOf(String text, char comma, int n)
    {
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == comma)
            {
                count++;
                if(count == n)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public void spAttDefSimulator()
    {
        Information i = new Information();
        ArrayList<String> user = i.teamBuild();
        ArrayList<String> enemy = i.randomTeamBuild();
        int spaCount = 0;
        int defCount = 0;
        int diff = 0;
        for(int k = 0; k < user.size(); k++)
        {
            int first = user.get(k).toString().indexOf(",");
            int second = user.get(k).toString().indexOf(",", first + 1) + 1;
            String userPokemonName = user.get(k).toString().substring(first + 2, second - 1);
            String enemyPokemonName = enemy.get(k).toString().substring(first + 2, second - 1);
            String pokemonInfo = user.get(k).toString();
            int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 16);
            int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
            String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
            int spAttack = Integer.parseInt(data);
            String enemyPokemonInfo = enemy.get(k).toString();
            int eCommaIndex = this.nthIndexOf(enemyPokemonInfo, ',' , 16);
            int eCommaIndexTwo = enemyPokemonInfo.indexOf("," , eCommaIndex + 1) + 1;
            String eData = enemyPokemonInfo.substring(eCommaIndex + 2, eCommaIndexTwo - 1);
            int eSpAttack = Integer.parseInt(eData);
            if(spAttack > eSpAttack)
            {
                diff = (spAttack - eSpAttack);
                System.out.println(userPokemonName + " has a greater special attack than " + enemyPokemonName + " by " + diff);
                System.out.println();
                spaCount++;
            }
            if(spAttack < eSpAttack)
            {
                diff = (eSpAttack - spAttack);
                System.out.print(userPokemonName + " has LESS special attack than " + enemyPokemonName + " by " + diff);
                System.out.println();
            }
            if(spAttack == eSpAttack)
            {
                System.out.println(userPokemonName + " and " + enemyPokemonName + " have the same special attack");
                System.out.println();
            }

        }
        for(int k = 0; k < user.size(); k++)
        {
            int first = user.get(k).toString().indexOf(",");
            int second = user.get(k).toString().indexOf(",", first + 1) + 1;
            String userPokemonName = user.get(k).toString().substring(first + 2, second - 1);
            String enemyPokemonName = enemy.get(k).toString().substring(first + 2, second - 1);
            String pokemonInfo = user.get(k).toString();
            int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 16);
            int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
            String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
            int defUserInd = this.nthIndexOf(pokemonInfo, ',' , 15);
            int defUserInd2 = pokemonInfo.indexOf(",", defUserInd + 1) + 1;
            String defData = pokemonInfo.substring(defUserInd + 2, defUserInd2 - 1);
            int def = Integer.parseInt(defData);

            String enemyPokemonInfo = enemy.get(k).toString();
            int eCommaIndex = this.nthIndexOf(enemyPokemonInfo, ',' , 16);
            int eCommaIndexTwo = enemyPokemonInfo.indexOf("," , eCommaIndex + 1) + 1;
            String eData = enemyPokemonInfo.substring(eCommaIndex + 2, eCommaIndexTwo - 1);
            int eDefUserInd = this.nthIndexOf(enemyPokemonInfo, ',' , 15);
            int eDefUserInd2 = enemyPokemonInfo.indexOf(",", eDefUserInd + 1) + 1;
            String eDefData = enemyPokemonInfo.substring(eDefUserInd + 2, eDefUserInd2 - 1);
            int eDef = Integer.parseInt(eDefData);

            if(def > eDef)
            {
                diff = (def - eDef);
                System.out.println(userPokemonName + " has greater defense than   " + enemyPokemonName);
                System.out.println();
                defCount++;
            }
            if(def < eDef)
            {
                diff = (eDef - def);
                System.out.println(userPokemonName + " has LESS defense than   " + enemyPokemonName + " by " + diff);
                System.out.println();
            }
            if(def == eDef)
            {
                System.out.println(userPokemonName + " and  " + enemyPokemonName + "  have the same defense stat");
                System.out.println();
            }
        }
        System.out.println("Your results! ");
        System.out.println("Your pokemon had greater special attack than the enemy " + spaCount + " times!");
        System.out.println();
        System.out.println("Your pokemon had a greater defense than the enemy " + defCount + " times!");
        System.out.println("Thank you for using this simulation");
    }

}