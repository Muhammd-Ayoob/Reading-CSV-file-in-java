
package citypopulations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class CityPopulations {
    
    public static int findMax( int [ ] population )
    {
    
        int pop =0;
        
        for(int i=0; i<population.length;i++)
        {
        
            if(population[i]>pop)
            {
            
                pop = population[i];
            }
        }
        
        return pop;
    }

    
    
    
    public static int findMaxForState( int [ ] population, String [ ] states,String nameOfState )
    {
    
      
        
        int max=0;
        
        for(int i=0;i<population.length;i++)
        {
            if(population[i]>max && states[i].equals(nameOfState))
            {
                max= population[i];
            }
        }
        return max;
    }
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "cityPopulations.csv";
        
        String line ="";
        
        BufferedReader br = new BufferedReader(new FileReader(path));
        
        //String array[]= null;
        int pop[]=new int [8619];
        String states[]= new String[8619];
        
        int i=0;
        String array[]= {};
        
        
            while((line = br.readLine())!= null|| i<8619)
            {
                array = line.split(",");
               if(i>0)
               {
                pop[i]=Integer.parseInt(array[0]);
                
                states[i]= array[1];
               }
               
               
               i++;
            }
           
            String nameOfState= "Alabama";
            
            System.out.println("City name is:    Keiser with maximum population = "+findMax(pop));
            
            System.out.println("city name is:    Auburn with maximum popoulation in "+nameOfState+" population = "+findMaxForState(pop, states, nameOfState));
            
    }
    
    
    
}
