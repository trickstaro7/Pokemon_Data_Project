import java.util.*;
public class Information
{
    private ConvertToList cL = new ConvertToList();
    private List<List<String>> fullDex = cL.dataPoint();
    private Scanner userInput = new Scanner(System.in);

    public Information()
    {

    }
    public void typeSort()
    {   
        int size = 0;
        int count = 0;
        double percent = 0.0;

        ArrayList<String> grassList = new ArrayList<String>();
        ArrayList<String> waterList = new ArrayList<String>();
        ArrayList<String> fireList = new ArrayList<String>();
        ArrayList<String> poisonList = new ArrayList<String>();
        ArrayList<String> flyingList = new ArrayList<String>();
        ArrayList<String> rockList = new ArrayList<String>();
        ArrayList<String> groundList = new ArrayList<String>();
        ArrayList<String> psychicList = new ArrayList<String>();
        ArrayList<String> iceList = new ArrayList<String>();
        ArrayList<String> normalList = new ArrayList<String>();
        ArrayList<String> dragonList = new ArrayList<String>();
        ArrayList<String> bugList = new ArrayList<String>();
        ArrayList<String> ghostList = new ArrayList<String>();
        ArrayList<String> fightingList = new ArrayList<String>();
        ArrayList<String> electricList = new ArrayList<String>();

        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).contains("grass"))
            {
                grassList.add(fullDex.get(i).toString());
            }
            if(fullDex.get(i).contains("water"))
            {
                waterList.add(fullDex.get(i).toString());
            }
            if(fullDex.get(i).contains("fire"))
            {
                fireList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("poison"))
            {
                poisonList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("flying"))
            {
                flyingList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("rock"))
            {
                rockList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("ground"))
            {
                groundList.add(fullDex.get(i).toString());
            }
            if(fullDex.get(i).contains("psychic"))
            {
                psychicList.add(fullDex.get(i).toString());
            }
            if(fullDex.get(i).contains("ice"))
            {
                iceList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("normal"))
            {
                normalList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("dragon"))
            {
                dragonList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("bug"))
            {
                bugList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("ghost"))
            {
                ghostList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("fighting"))
            {
                fightingList.add(fullDex.get(i).toString());

            }
            if(fullDex.get(i).contains("electric"))
            {
                electricList.add(fullDex.get(i).toString());

            }
        }
        System.out.println("   Select an option to see all pokemon with the type you request   ");
        System.out.println();
        System.out.println("1: Grass");
        System.out.println("2: Water");
        System.out.println("3: Fire");
        System.out.println("4: Poison");
        System.out.println("5: Flying");
        System.out.println("6: Rock");
        System.out.println("7: Ground");
        System.out.println("8: Psychic");
        System.out.println("9: Ice");
        System.out.println("10: Normal");
        System.out.println("11: Dragon");
        System.out.println("12: Bug");
        System.out.println("13: Ghost");
        System.out.println("14: Fighting");
        System.out.println("15: Electric");
        int num = userInput.nextInt();
        if(num == 1)
        {
            for(int j = 0; j < grassList.size(); j++)
            {
                System.out.println(grassList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + " percent of all pokemon in generation 1!!!");
        }
        else if(num == 2)
        {
            for(int j = 0; j < waterList.size(); j++)
            {
                System.out.println(waterList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + " percent of all pokemon in generation 1!!!");
        }
        else if(num == 3)
        {
            for(int j = 0; j < fireList.size(); j++)
            {
                System.out.println(fireList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 4)
        {
            for(int j = 0; j < poisonList.size(); j++)
            {
                System.out.println(poisonList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 5)
        {
            for(int j = 0; j < flyingList.size(); j++)
            {
                System.out.println(flyingList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + " percent of all pokemon in generation 1!!!");
        }
        else if(num == 6)
        {
            for(int j = 0; j < rockList.size(); j++)
            {
                System.out.println(rockList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 7)
        {
            for(int j = 0; j < groundList.size(); j++)
            {
                System.out.println(groundList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + " percent of all pokemon in generation 1!!!");
        }
        else if(num == 8)
        {
            for(int j = 0; j < psychicList.size(); j++)
            {
                System.out.println(psychicList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 9)
        {
           for(int j = 0; j < iceList.size(); j++)
            {
                System.out.println(iceList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 10)
        {
           for(int j = 0; j < normalList.size(); j++)
            {
                System.out.println(normalList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 11)
        {
            for(int j = 0; j < dragonList.size(); j++)
            {
                System.out.println(dragonList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
             System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 12)
        {
            for(int j = 0; j < bugList.size(); j++)
            {
                System.out.println(bugList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 13)
        {
            for(int j = 0; j < ghostList.size(); j++)
            {
                System.out.println(ghostList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 14)
        {
            for(int j = 0; j < fightingList.size(); j++)
            {
                System.out.println(fightingList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        else if(num == 15)
        {
            for(int j = 0; j < electricList.size(); j++)
            {
                System.out.println(electricList.get(j).toString());
                System.out.println();
                count++;
            }
            percent = ((double)count / 151) * 100;
            System.out.println("        There are: " + count + "  Pokemon that have this type!");
            System.out.println("        This type takes up " + percent + "  percent of all pokemon in generation 1!!!");
        }
        while(num > 15 && num < 1)
        {
            System.out.print("Please enter a valid number between 1 and 15");
            num = userInput.nextInt();
        }

        //search the string for "type name" and return that value;    
    }
    public String getTypeOf()
    {
        System.out.println("Which pokemon would you like to know the type of? *Make sure the first letter in its name is capitalized!*");
        String name = userInput.nextLine();
        String types = "";
        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).toString().contains(name)) //check to see if object in index "i" has the pokemon name in there
            {
                int first = fullDex.get(i).toString().indexOf(",");
                int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                String pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
            if(name.contains(pokemonName))
            {
                if(fullDex.get(i).toString().contains("grass"))
                {
                    types += " grass,";
                }
                if(fullDex.get(i).toString().contains("water"))
                {
                    types += " water,";
                }
                if(fullDex.get(i).toString().contains("fire"))
                {
                    types += " fire,";
                }
                if(fullDex.get(i).toString().contains("poison"))
                {
                    types += " poison,";
                }
                if(fullDex.get(i).toString().contains("flying"))
                {
                    types += " flying,";
                }
                if(fullDex.get(i).toString().contains("rock"))
                {
                    types += " rock,";
                }
                if(fullDex.get(i).toString().contains("ground"))
                {
                    types += " ground,";
                }
                if(fullDex.get(i).toString().contains("psychic"))
                {
                    types += " psychic,";
                }
                if(fullDex.get(i).toString().contains("normal"))
                {
                    types += " normal,";
                }
                if(fullDex.get(i).toString().contains("dragon"))
                {
                    types += " dragon,";
                }
                if(fullDex.get(i).toString().contains("bug"))
                {
                    types += " bug,";
                }
                if(fullDex.get(i).toString().contains("ghost"))
                {
                    types += " ghost,";
                }
                if(fullDex.get(i).toString().contains("fighting"))
                {
                    types += " fighting,";
                } 
                if(fullDex.get(i).toString().contains("electric"))
                {
                    types += " electric,";
                }
                if(fullDex.get(i).toString().contains("ice"))
                {
                    types += " ice,";
                }
                if(fullDex.get(i).toString().contains("None"))
                {
                    break;
                }
            }

            }

        }
        if(types.equals(""))
            {
                types += "That pokemon does not exist in Generation 1";
            }
        return types;
    }
    public String getNum()
    {
        System.out.println("Which Pokemon would you like to get their number of? *This will make forming your simulation team much easier!");
        String name = userInput.nextLine();
        String pokemonName = "";
        String entryNum = "";
        for(int i = 0; i < fullDex.size(); i++)
        {
            if(fullDex.get(i).toString().contains(name)) 
            {
                if(fullDex.get(i).toString().charAt(2) == ',')
                {
                    int first = fullDex.get(i).toString().indexOf(",");
                    int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                    pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                    if(name.contains(pokemonName))
                    {
                        entryNum += fullDex.get(i).toString().charAt(1);
                    }
                }
                else if(fullDex.get(i).toString().charAt(3) == ',')
                {
                    int first = fullDex.get(i).toString().indexOf(",");
                    int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                    pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                    if(name.contains(pokemonName))
                    {
                        entryNum += fullDex.get(i).toString().charAt(1);
                        entryNum += fullDex.get(i).toString().charAt(2);
                    }
                }
                else if(fullDex.get(i).toString().charAt(4) == ',')
                {
                    int first = fullDex.get(i).toString().indexOf(",");
                    int second = fullDex.get(i).toString().indexOf(",", first + 1) + 1;
                    pokemonName = fullDex.get(i).toString().substring(first + 2, second - 1);
                    if(name.contains(pokemonName))
                    {
                        entryNum += fullDex.get(i).toString().charAt(1);
                        entryNum += fullDex.get(i).toString().charAt(2);
                        entryNum += fullDex.get(i).toString().charAt(3);
                    }
                }


            }
            /*if(entryNum.equals(""))
            {
                entryNum += "This Pokemon does not exist in Generation 1";
            }
            */
        }
        return entryNum;
    }
    public ArrayList<String> teamBuild()
    {   ArrayList userTeam = new ArrayList<String>();
        String name = "";

        System.out.println("Lets make your team of six pokemon! ");
        for(int j = 0; j < 6; j++)
        {
            System.out.println("Enter in the NUMBER of the pokemon that you want in your team. ");
            System.out.print("If you really want 6 of the same pokemon.. you can! its your team after all!");
            System.out.println();
            int num = userInput.nextInt();
            userTeam.add(fullDex.get(num).toString());
        }
        return userTeam;
    }
    public ArrayList<String> randomTeamBuild()
    {
        ArrayList randomTeam = new ArrayList<String>();
        for(int j = 0; j < 6; j++)
        {
            int randomNum = (int)(Math.random()*151) + 1;
            randomTeam.add(fullDex.get(randomNum).toString());
        }
        return randomTeam;
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
    public double malePercent()
    {
        System.out.println("Enter in the name of the pokemon that you want to know the percentage of it being MALE");
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


            int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 7);
            int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
            String malePercentage = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
            double malePercenting = Double.parseDouble(malePercentage);
            System.out.print("The percentage of your pokemon being male is: ");
            return malePercenting;
            }
            }

        }
    System.out.print("This pokemon does not exist in Generation ");
    return 1.0 ;
    }

    public double femalePercent()
    {
        System.out.println("Enter in the name of the pokemon that you want to know the percentage of it being FEMALE");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 8);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String femalePercentage = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double femalePercenting = Double.parseDouble(femalePercentage);
                System.out.print("The percentage of your pokemon being female is: ");
                return femalePercenting;
            }
            }

        }
        System.out.print("This pokemon does not exist in Generation ");
        return 1.0;
    }
    public int captureRate()
    {
        System.out.println("Enter in the name of the pokemon that you want to know the capture rate of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 9);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                int capRate = Integer.parseInt(data);
                System.out.print("The capture rate of you Pokemon out of 255 WITH a REGULAR Pokeball is:  ");
                return capRate;
            }
            }

        }
        System.out.print("This pokemon does not exist in Generation ");
        return 1;
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


    public String weakToFire()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon that you want to know the capture rate of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 20);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double fireNum = Double.parseDouble(data);
                if((int)fireNum > 1)
                {
                    message += pokemonName + " is weak to fire";
                }
                else if((int)fireNum == 1)
                {
                    message += pokemonName + " is not weak to fire but is also not resistant";
                }
                else if(fireNum < 1 && fireNum > 0)
                {
                    message += pokemonName + " is resistant to fire";
                }
                else if(fireNum == 0.0)
                {
                    message += pokemonName + " is IMMUNE to fire";
                }
            }
            }

        }
        return message;

    }

    public String weakToWater()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon that you want to know the water resistance of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 20);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double waterNum = Double.parseDouble(data);
                if((int)waterNum > 1)
                {
                    message += pokemonName + " is weak to water";
                }
                else if((int)waterNum == 1)
                {
                    message += pokemonName + " is not weak to water but is also not resistant";
                }
                else if(waterNum < 1.0 && waterNum > 0)
                {
                    message += pokemonName + " is resistant to water";
                }
                else if(waterNum == 0.0)
                {
                    message += pokemonName + " is IMMUNE to water";
                }
            }
            }

        }
        return message;
    }

    public String weakToElectric()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to electricty of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 21);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to electric";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to electric but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to electric";
                }
                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to electric";
                }
            }
            }

        }
        return message;
    }

    public String weakToGrass()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to grass of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 22);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to grass";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to grass but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to grass";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to grass";
                }
            }
            }

        }
        return message;
    }

    public String weakToIce()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to ice of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 23);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to ice";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to ice but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to ice";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to ice";
                }
            }
            }

        }
        return message;
    }

    public String weakToFighting()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to fighting of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 24);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to fighting";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to fighting but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to fighting";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to fighting";
                }
            }
            }

        }
        return message;
    }

    public String weakToPoison()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to poison of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 25);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to poison";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to poison but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to poison";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to poison";
                }
            }
            }

        }
        return message;
    }

    public String weakToGround()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to ground of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 26);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to ground";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to ground but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to ground";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to ground";
                }
            }
            }

        }
        return message;
    }

    public String weakToFlying()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to flying of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 27);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to flying";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to flying but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to flying";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to flying";
                }
            }
            }

        }
        return message;
    }

    public String weakToPsychic()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to psychic of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 28);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to psychic";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to psychic but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to psychic";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to psychic";
                }
            }
            }

        }
        return message;
    }

    public String weakToBug()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to weak of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 29);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to bug";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to bug but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to bug";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to bug";
                }
            }
            }

        }
        return message;
    }

    public String weakToRock()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to rock of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 30);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to rock";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to rock but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to rock";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to rock";
                }
            }
            }

        }
        return message;
    }

    public String weakToGhost()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to ghost of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 31);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to ghost";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to ghost but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to ghost";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to ghost";
                }
            }
            }

        }
        return message;
    }

    public String weakToDragon()
    {
        String message = "";
        System.out.println("Enter in the name of the pokemon you would like to know its resistance to dragon of");
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
                int commaIndex = this.nthIndexOf(pokemonInfo, ',' , 32);
                int commaIndexTwo = pokemonInfo.indexOf("," , commaIndex + 1) + 1;
                String data = pokemonInfo.substring(commaIndex + 2, commaIndexTwo - 1);
                double num = Double.parseDouble(data);
                if((int)num > 1)
                {
                    message += pokemonName + " is weak to dragon";
                }
                else if((int)num == 1)
                {
                    message += pokemonName + " is not weak to dragon but is also not resistant";
                }
                else if(num < 1.0 && num > 0.0)
                {
                    message += pokemonName + " is resistant to dragon";
                }

                else if(num == 0.0)
                {
                    message += pokemonName + " is IMMUNE to dragon";
                }
            }
            }

        }
        return message;
    }



}