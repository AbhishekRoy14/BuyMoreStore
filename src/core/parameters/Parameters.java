
package core.parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author royab
 */

/**
 * Parameters objects represent details regarding sales and groupSubGroupList.
 */
public class Parameters {
    private static Map<String, List<String>>  groupSubGroupList;    // List of group and subgroup
    private static int startingGSTNumber;                           // GST Number
    private static int startingSaleID;                              // SaleID
    
    //protected protocol
    protected Parameters()
    {
        initialize();
    }
   
    public static void initialize()
    {
        groupSubGroupList = new TreeMap();
        startingGSTNumber = 1000000;
        startingSaleID = 1000;
        addEntry("Beverages", "coffee/tea, juice, soda");
        addEntry("Bread/Bakery", "sandwich loaves, dinner rolls, tortillas, bagels");
        addEntry("Canned/Jarred Goods", "vegetables, spaghetti sauce, ketchup");
        addEntry("Dairy", "cheeses, eggs, milk, yogurt, butter");
        addEntry("Dry/Baking Goods", "cereals, flour, sugar, pasta, mixes");
        addEntry("Frozen Foods", "waffles, vegetables, individual meals, ice cream");
        addEntry("Meat", "lunch meat, poultry, beef, pork");
        addEntry("Produce", "fruits, vegetables");
        addEntry("Cleaners","all- purpose, laundry detergent, dishwashing liquid/detergent");
        addEntry("Paper Goods","paper towels, toilet paper, aluminum foil, sandwich bags");
        addEntry("Personal Care","shampoo, soap, hand soap, shaving cream");
        addEntry("Other","baby items, pet items, batteries, greeting cards");
    }
    
    /**
     * 
     * @param group adding entry into group
     * @param subGroups adding entry into subgroup
     */
    private static void addEntry(String group, String subGroups)
    {
        String[] subGroupArray = subGroups.split(",");
        List<String> subGroupList= Arrays.asList(subGroupArray);
        groupSubGroupList.put(group, subGroupList);
    }
    
    /**
     * 
     * @return 
     * returning a list collection of groupNames
     */
    //Using unmodifiable list
    public static List<String> getAllGroups()
    {
        Set groupSet = groupSubGroupList.keySet();
        List<String> groupNames = new ArrayList<>(groupSet);
        return Collections.unmodifiableList(groupNames);
    }
    
    /**
     * 
     * @param group
     * @return 
     * returning a list collection of subGroupNames
     */
    //Using unmodifiable list
    public static List<String> getSubgroups(String group)
    {
        List<String> subGroupNames = groupSubGroupList.get(group);
        return Collections.unmodifiableList(subGroupNames);
    }
    
    /**
     * 
     * @return 
     * returns starting GST Number for the sale
     */
    
    public static int getStartingGSTNumber()
    {
        return startingGSTNumber;
    }
    
    /**
     * 
     * @return 
     * returns starting SaleID
     */
    public static int getStartingSaleID()
    {
        return startingSaleID;
    }
    
}
