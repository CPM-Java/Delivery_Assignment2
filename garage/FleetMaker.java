package garage;


/** DO NOT MODIFY THIS CLASS
 * Creates ArrayList of delivery Vehicles.
 * 
 * @author GK CPM 
 * @version 2/10/18
 */

import java.util.ArrayList;
import java.util.Random;

public class FleetMaker
{
    // instance variables 
    private ArrayList<Vehicle> fleet = new ArrayList<Vehicle>();
    private Random rand = new Random();

    /**
     * Constructor for objects of class Driver
     */
    public FleetMaker()
    {
       //small fleet
       int yearOfMfg = 2000 + rand.nextInt(20);
       int miles = (int)(10000 * (2020 - yearOfMfg) * rand.nextDouble());
       fleet.add(new Motorcycle(yearOfMfg, miles, this.makeAplate(yearOfMfg)));
       
       yearOfMfg = 2000 + rand.nextInt(20);
       miles = (int)(10000 * (2020 - yearOfMfg) * rand.nextDouble());
       fleet.add(new ElectricCar(yearOfMfg, miles, this.makeAplate(yearOfMfg)));
       
       yearOfMfg = 2000 + rand.nextInt(20);
       miles = (int)(10000 * (2020 - yearOfMfg) * rand.nextDouble());
       fleet.add(new Van(yearOfMfg, miles, this.makeAplate(yearOfMfg)));       
        
    }

    /**
     * Simulate CA Lic Numbers
     * 
     * @param  mfgDate   vehicle date of manufacture
     * @return     a String representing an example CA license plate number 
     */
    public String makeAplate(int mfgDate)
    {
        int leadDigit = (mfgDate - 2000)/4 + 4;
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaSeries = "";
        for(int x = 0; x < 3; x++){
            int chooser = rand.nextInt(alpha.length());
            alphaSeries += alpha.substring(chooser,chooser+1);
        }
        return leadDigit + alphaSeries + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
    }
    
    /**
     * Accessor method for the List of vehicles
     * 
     * @return     an ArrayList representing the Vehicles in the fleet 
     */
    public ArrayList<Vehicle> getFleet()
    {
        return fleet;
    }
        
}
