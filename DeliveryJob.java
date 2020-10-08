
/**DO NOT MODIFY
 * Generate a delivery job.
 * 
 * @author GK CPM 
 * @version 2/10/18
 */
public class DeliveryJob
{
    // instance variables
    private int myDistance;
    private int myWeight;

    /**
     * Constructor for objects of class DeliveryJob
     */
    public DeliveryJob()
    {
        // weights 1 to 1000 pounds, positively skewed ^3
        myWeight = (int) Math.ceil(Math.pow(Math.random()*Math.pow(1000,1.0/3.0),3));
        
        // distances 4 to 100 miles, positively skewed ^2
        myDistance = (int) Math.ceil(Math.pow(Math.random()*Math.sqrt(99) + 1,2));
    }

    /**
     * Accessor method for weight of delivery
     * @return     weight in pounds
     */
    public int getWeight()
    {
        return myWeight;
    }
    
   /**
     * Accessor method for round trip distance of delivery
     * @return     distance in miles 
     */
    public int getDistance()
    {
        return myDistance;
    }
    
    //toString
    public String toString()
    {
        return "This delivery job is " + myWeight + " pounds and " + myDistance + " miles.";
    }
}
