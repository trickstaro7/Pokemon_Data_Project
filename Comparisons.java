import java.util.*;
public class Comparisons
{
    private ConvertToList cL = new ConvertToList();
    private Information info = new Information();
    private List<List<String>> fullDex = cL.dataPoint();
    private Scanner userInput = new Scanner(System.in);

    public Comparisons()
    {

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


    public String speedCompareDuo()
    {
        int[] speed = new int[2];
        ArrayList pokemonNames = new ArrayList<String>();
        ArrayList compared = new ArrayList<String>();
        String result = "";
        int count = 0;
        int diff = 0;
        System.out.println("Please enter the name of the first pokemon that you want to compare the SPEED stats of");
        String answer = userInput.nextLine();
        System.out.println("Please enter the name of the second pokemon that you want to compare the SPEEED stats of");
        String answerTwo = userInput.nextLine();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains(answer))
            {
               int first = fullDex.get(i).toString().indexOf(",");
               int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
               String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
               pokemonNames.add(pokemonName);
               count++;

               if(answer.contains(pokemonName))
               {
                   compared.add(fullDex.get(i));
               }
            }
            if(fullDex.get(i).contains(answerTwo))
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                pokemonNames.add(pokemonName);

                if(answerTwo.contains(pokemonName))
                {
                   compared.add(fullDex.get(i));
                }
            }

        }
        for(int i = 0; i < compared.size(); i++)
        {
            int speedComma = this.nthIndexOf(compared.get(i).toString(), ',', 17);
            int speedCommaTwo = compared.get(i).toString().indexOf(",", speedComma + 1) + 1;
            String speeding = compared.get(i).toString().substring(speedComma + 2, speedCommaTwo - 1);
            int speedStat = Integer.parseInt(speeding);
            speed[i] = speedStat;
        }

        if(speed[0] > speed[1])
        {
            diff = (speed[0] - speed[1]);
            result += pokemonNames.get(0).toString() + " has a greater speed by" + diff;
        }
        else if(speed[0] < speed[1])
        {
            diff = (speed[1] - speed[0]);
            result += pokemonNames.get(0).toString() + " is slower than " + pokemonNames.get(1).toString() + " by " +  diff;
        }
        else if(speed[0] == speed[1])
        {
            result += "Both of these Pokemon are equally as fast to each other! ";
        }
        return result;
    }
    public String attackCompareDuo()
    {
        int[] attack = new int[2];
        ArrayList pokemonNames = new ArrayList<String>();
        ArrayList compared = new ArrayList<String>();
        String result = "";
        int count = 0;
        int diff = 0;
        System.out.println("Please enter the name of the first pokemon that you want to compare the DEFENSE stats of");
        String answer = userInput.nextLine();
        System.out.println("Please enter the name of the second pokemon that you want to compare the DEFENSE stats of");
        String answerTwo = userInput.nextLine();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains(answer))
            {
               int first = fullDex.get(i).toString().indexOf(",");
               int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
               String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
               pokemonNames.add(pokemonName);

               if(answer.equals(pokemonName))
               {
                   compared.add(fullDex.get(i));
               }
            }
            if(fullDex.get(i).contains(answerTwo))
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                pokemonNames.add(pokemonName);

                if(answerTwo.equals(pokemonName))
                {
                   compared.add(fullDex.get(i));
                }
            }

        }
        for(int i = 0; i < compared.size(); i++)
        {
            int attackComma = this.nthIndexOf(compared.get(i).toString(), ',', 15);
            int attackCommaTwo = compared.get(i).toString().indexOf(",", attackComma + 1) + 1;
            String attacking = compared.get(i).toString().substring(attackComma + 2, attackCommaTwo - 1);
            int attackStat = Integer.parseInt(attacking);
            attack[i] = attackStat; 
        }
        if(attack[0] > attack[1])
        {
            diff = (attack[0] - attack[1]);
            result += pokemonNames.get(0).toString() + " has greater attack by" + diff;
        }
        else if(attack[0] < attack[1])
        {
            diff = (attack[1] - attack[0]);
            result += pokemonNames.get(0).toString() + " has less attack than than " + pokemonNames.get(1).toString() + " by " +  diff;
        }
        else if(attack[0] == attack[1])
        {
            result += "Both of these Pokemon have equal ATTACK to each other! ";
        }
        return result;
    }
    public String hpDuoComparison()
    {
        int[] hp = new int[2];
        ArrayList pokemonNames = new ArrayList<String>();
        ArrayList compared = new ArrayList<String>();
        String result = "";
        int count = 0;
        int diff = 0;
        System.out.println("Please enter the name of the first pokemon that you want to compare the ATTACK stats of");
        String answer = userInput.nextLine();
        System.out.println("Please enter the name of the second pokemon that you want to compare the ATTACK stats of");
        String answerTwo = userInput.nextLine();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains(answer))
            {
               int first = fullDex.get(i).toString().indexOf(",");
               int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
               String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
               pokemonNames.add(pokemonName);

               if(answer.equals(pokemonName))
               {
                   compared.add(fullDex.get(i));
               }
            }
            if(fullDex.get(i).contains(answerTwo))
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                pokemonNames.add(pokemonName);

                if(answerTwo.equals(pokemonName))
                {
                   compared.add(fullDex.get(i));
                }
            }

        }
        for(int i = 0; i < compared.size(); i++)
        {
            int hpComma = this.nthIndexOf(compared.get(i).toString(), ',', 13);
            int hpCommaTwo = compared.get(i).toString().indexOf(",", hpComma + 1) + 1;
            String health = compared.get(i).toString().substring(hpComma + 2, hpCommaTwo - 1);
            int hpStat = Integer.parseInt(health);
            hp[i] = hpStat; 
        }
        if(hp[0] > hp[1])
        {
            diff = (hp[0] - hp[1]);
            result += pokemonNames.get(0).toString() + " has greater hp by" + diff;
        }
        else if(hp[0] < hp[1])
        {
            diff = (hp[1] - hp[0]);
            result += pokemonNames.get(0).toString() + " has less hp than than " + pokemonNames.get(1).toString() + " by " +  diff;
        }
        else if(hp[0] == hp[1])
        {
            result += "Both of these Pokemon have equal hp to each other! ";
        }
        return result;
    }
    public String defComparisonDuo()
    {
        int[] def = new int[2];
        ArrayList pokemonNames = new ArrayList<String>();
        ArrayList compared = new ArrayList<String>();
        String result = "";
        int count = 0;
        int diff = 0;
        System.out.println("Please enter the name of the first pokemon that you want to compare the DEFENSE stats of");
        String answer = userInput.nextLine();
        System.out.println("Please enter the name of the second pokemon that you want to compare the DEFENSE stats of");
        String answerTwo = userInput.nextLine();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains(answer))
            {
               int first = fullDex.get(i).toString().indexOf(",");
               int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
               String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
               pokemonNames.add(pokemonName);

               if(answer.equals(pokemonName))
               {
                   compared.add(fullDex.get(i));
               }
            }
            if(fullDex.get(i).contains(answerTwo))
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                pokemonNames.add(pokemonName);

                if(answerTwo.equals(pokemonName))
                {
                   compared.add(fullDex.get(i));
                }
            }

        }
        for(int i = 0; i < compared.size(); i++)
        {
            int defComma = this.nthIndexOf(compared.get(i).toString(), ',', 15);
            int defCommaTwo = compared.get(i).toString().indexOf(",", defComma + 1) + 1;
            String defending = compared.get(i).toString().substring(defComma + 2, defCommaTwo - 1);
            int defStat = Integer.parseInt(defending);
            def[i] = defStat; 
        }
        if(def[0] > def[1])
        {
            diff = (def[0] - def[1]);
            result += pokemonNames.get(0).toString() + " has greater DEFENSE by" + diff;
        }
        else if(def[0] < def[1])
        {
            diff = (def[1] - def[0]);
            result += pokemonNames.get(0).toString() + " has less DEFENSE than than " + pokemonNames.get(1).toString() + " by " +  diff;
        }
        else if(def[0] == def[1])
        {
            result += "Both of these Pokemon have equal DEFENSE to each other! ";
        }
        return result;
    }
    public String heightComparisonDuo()
    {
        double[] height = new double[2];
        ArrayList pokemonNames = new ArrayList<String>();
        ArrayList compared = new ArrayList<String>();
        String result = "";
        int count = 0;
        double diff = 0;
        System.out.println("Please enter the name of the first pokemon that you want to compare the HEIGHT stats of");
        String answer = userInput.nextLine();
        System.out.println("Please enter the name of the second pokemon that you want to compare the HEIGHT stats of");
        String answerTwo = userInput.nextLine();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains(answer))
            {
               int first = fullDex.get(i).toString().indexOf(",");
               int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
               String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
               pokemonNames.add(pokemonName);

               if(answer.equals(pokemonName))
               {
                   compared.add(fullDex.get(i));
               }
            }
            if(fullDex.get(i).contains(answerTwo))
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                pokemonNames.add(pokemonName);

                if(answerTwo.equals(pokemonName))
                {
                   compared.add(fullDex.get(i));
                }
            }

        }
        for(int i = 0; i < compared.size(); i++)
        {
            int heightComma = this.nthIndexOf(compared.get(i).toString(), ',', 5);
            int heightCommaTwo = compared.get(i).toString().indexOf(",", heightComma + 1) + 1;
            String tall = compared.get(i).toString().substring(heightComma + 2, heightCommaTwo - 1);
            double heightStat = Double.parseDouble(tall);
            height[i] = heightStat; 
        }
        if(height[0] > height[1])
        {
            diff = (height[0] - height[1]);
            result += pokemonNames.get(0).toString() + " is TALLER than " + pokemonNames.get(1).toString() + "by" + diff + " METERS";
        }
        else if(height[0] < height[1])
        {
            diff = (height[1] - height[0]);
            result += pokemonNames.get(0).toString() + " is SHORTER than " + pokemonNames.get(1).toString() + " by " +  diff + " METERS ";
        }
        else if(height[0] == height[1])
        {
            result += "Both of these Pokemon have equal height to each other! ";
        }
        return result;
    }

    public String weightComparisonDuo()
    {
        double[] weight = new double[2];
        ArrayList pokemonNames = new ArrayList<String>();
        ArrayList compared = new ArrayList<String>();
        String result = "";
        int count = 0;
        double diff = 0;
        System.out.println("Please enter the name of the first pokemon that you want to compare the WEIGHT stats of");
        String answer = userInput.nextLine();
        System.out.println("Please enter the name of the second pokemon that you want to compare the WEIGHT stats of");
        String answerTwo = userInput.nextLine();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains(answer))
            {
               int first = fullDex.get(i).toString().indexOf(",");
               int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
               String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
               pokemonNames.add(pokemonName);

               if(answer.equals(pokemonName))
               {
                   compared.add(fullDex.get(i));
               }
            }
            if(fullDex.get(i).contains(answerTwo))
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                pokemonNames.add(pokemonName);

                if(answerTwo.equals(pokemonName))
                {
                   compared.add(fullDex.get(i));
                }
            }

        }
        for(int i = 0; i < compared.size(); i++)
        {
            int weightComma = this.nthIndexOf(compared.get(i).toString(), ',', 6);
            int weightCommaTwo = compared.get(i).toString().indexOf(",", weightComma + 1) + 1;
            String tall = compared.get(i).toString().substring(weightComma + 2, weightCommaTwo - 1);
            double weightStat = Double.parseDouble(tall);
            weight[i] = weightStat; 
        }
        if(weight[0] > weight[1])
        {
            diff = (weight[0] - weight[1]);
            result += pokemonNames.get(0).toString() + " is HEAVIER than " + pokemonNames.get(1).toString() + "by" + diff + " kg";
        }
        else if(weight[0] < weight[1])
        {
            diff = (weight[1] - weight[0]);
            result += pokemonNames.get(0).toString() + " is LIGHTER than " + pokemonNames.get(1).toString() + " by " +  diff + " kg ";
        }
        else if(weight[0] == weight[1])
        {
            result += "Both of these Pokemon have equal weight to each other! ";
        }
        return result;
    }



}
