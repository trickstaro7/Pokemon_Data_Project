import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConvertToList
{
    public ConvertToList()
    {

    }
    public List<List<String>> dataPoint()
    {
        try 
        { 
        List<List<String>> dataSet = new ArrayList<>();
        String file =  "FirstGenPokemon.csv";
        FileReader fR = new FileReader(file);
        BufferedReader r = new BufferedReader(fR);
        String ln = r.readLine(); 
        while(ln != null) //there's stuff in the line
        {
            List<String> dataPlus = Arrays.asList(ln.split(","));
            dataSet.add(dataPlus);
            ln = r.readLine();
        }
            return dataSet;
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return null;
    }


}