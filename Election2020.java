
import java.util.Scanner;

public class Election2020
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner( System.in );
    
    String candidate;
    int evs; 
    int needed; 
    
    System.out.println("Enter the presidential candidate's name: ");
    candidate = s.next(); 
    
    System.out.println("Enter the number of electoral votes that " + candidate + " has: ");
    evs = s.nextInt(); 
    
    if (evs == 269) 
    {
    System.out.println("Your candidate has 269 electoral votes (half of the total 538 electoral votes).The House of Representatives will decide who the next president will be.");
    }
    
    else if (evs < 270 && evs > 0)   
    {
      needed = (270 - evs);
    System.out.println("This is how many more electoral votes " + candidate + " needs to win the election: " + needed);
    }
    
    else if (evs > 270 && evs < 538)
    {
    System.out.println(candidate + " has won the 2020 election.");
    }
    
    else if (evs < 0)
    {
    System.out.println("Please enter a positive number. No negative numbers allowed.");
    }
    
    else if (evs > 538)
    {
    System.out.println("There's only 538 electoral votes in the Electoral College.");
    }
  }  
}