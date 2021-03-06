package garage;


/**DO NOT MODIFY
 * Super class for delivery vehicles
 * 
 * @author gk CPM
 * @version 2/8/18
 */
public class Vehicle
{
    private String myLicensePlate;
    private int myYear;
    private int myMileage;
    
   /**
     * Constructor for objects of type Vehicle
     * 
     * @param  inputYear   an integer representing the vehicle's manufacture date
     * @param  inputMiles   an integer representing the vehicle's milage
     * @param  lic   a String representing the vehicle's license plate number
     */
    public Vehicle(int inputYear, int inputMiles, String licNo) {
        
        myLicensePlate = licNo;
        myYear = inputYear;
        myMileage = inputMiles;
    }    
    
    /**
     * An accessor method to return the vehicle's year of manufacture
     * 
     * @return     the vehicles license plate number as a String 
     */
    public String getLicensePlate()
    {
        return myLicensePlate;
    }
    
    /**
     * An accessor method to return the vehicle's year of manufacture
     * 
     * @return     the vehicles year as an integer 
     */
    public int getYear()
    {
        return myYear;
    }
    
    /**
     * An accessor method to return the vehicle's mileage
     * 
     * @return     the vehicles mileage as an integer 
     */
    public int getMileage()
    {
        return myMileage;
    }
    
    /**
     * A Mutator method to increment the vehicle's milage
     * 
     * @param  inputMiles   an integer representing the additional vehicle miles
     */
    public void addMiles(int additionalMiles)
    {
        myMileage += additionalMiles;
    }
    
    
    /**
     * simulates pickup and delivery of goods
     * 
     * @param  amount   an integer representing the goods to be picked up in pounds
     * @param  dist   an integer representing the round trip miles of the delivery
     * @return     an integer representing the time it took to complete the trip in minutes
     */	
	public int deliver(int amount, int dist)
    {
        myMileage += dist;
        System.out.println("I went " + dist + " miles and picked up " + amount + " pounds.\nIt took all day.");
        return 480; // all day
    }
    
}
