
/**DO NOT MODIFY
 * CPM Delivery Service.
 * 
 * @author GK CPM 2018 
 * @version 2/11/18
 */

import java.util.ArrayList;
import garage.*;


public class Driver
{
    private ArrayList<Vehicle> fleet;

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        // get fleet of vehicles
        FleetMaker fm = new FleetMaker();
        //assume (0) motorcycle, (1) electric car, (2) Van
        fleet = fm.getFleet();        
    }

    /**
     * Simulates a work day at the CPM Delivery Service
     * 
     */
    public void workDay()
    {
        //check fleet
        System.out.println("\n\tMorning fleet check:");
        for(Vehicle v : fleet)
        {
            System.out.println(v.toString());
        }
        System.out.println();
        
        //one work day is 480 minutes
        int workMinutes = 0;
        int poundsDelivered = 0;
        while(workMinutes < 480)
        {
            // Get delivery assignment
            DeliveryJob dj = new DeliveryJob();
            
            Vehicle v;
            //Select vehicle
            if(dj.getWeight() <= Motorcycle.getCapacity())
            {
               v = fleet.get(0);
               ((Motorcycle)v).laneSplit(); //cast to specific
            }
            else if(dj.getWeight() <= ElectricCar.getCapacity())
            {
               v = fleet.get(1);
               ((ElectricCar)v).carPoolLane();//cast to specific
            }
            else //van 
            {
               v = fleet.get(2);
               ((Van)v).airConditioning();//cast to specific
            }
            
            //Does not need a cast to select the correct deliver method
            workMinutes += v.deliver(dj.getWeight(),dj.getDistance());
            
            poundsDelivered += dj.getWeight();
            
        }//end of while
        
        //end of day
        System.out.println("Today: " + poundsDelivered + " pounds delivered in " + workMinutes + " minutes.\n");
        

    }
}
