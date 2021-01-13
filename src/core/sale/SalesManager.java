
package core.sale;

import core.inventory.Item;
import core.parameters.Parameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author royab
 */


public class SalesManager {
    private static int nextSaleID = Parameters.getStartingSaleID();
    private static int nextGSTNumber = Parameters.getStartingGSTNumber();
    private static Map<Integer, Sale> saleHistory = new HashMap();
    
    private static Sale currentSale;
    private SalesPerson salesPerson = SalesPerson.getSalesPerson();
    
    /**
     * 
     * @param _soldItem sold item added to the current sale
     * adding item and updating sale
     */
    public static void addItemtoCurrentSale(Item _soldItem)
    {
        if(currentSale == null)
        {
            currentSale = new Sale(nextSaleID, nextGSTNumber);
            nextSaleID++;
            nextGSTNumber++;
        }
        currentSale.addItemAndUpdateSale(_soldItem);
    }
    
    public static void completeCurrentSale()
    {
        if(currentSale != null && currentSale.getCountOfItems() > 0)
        {
            saleHistory.put(currentSale.getSaleID(), new Sale(currentSale));
            currentSale = null;
        }
    }
    
    /**
     * Return total amount of current sale
     * @return 
     */
    public static double getTotalAmountOfCurrentSale()
    {
        if(currentSale!=null)
        {
            return currentSale.getTotalAmount();
        }
        return 0.0;
    }
    
    /**
     * Return discount amount of current sale
     * @return 
     */
    public static double getDiscountAmountOfCurrentSale()
    {
        if(currentSale!=null)
        {
            return currentSale.getDiscount();
        }
        return 0.0;
    }
    
    /**
     * Return current sale details in String
     * @return 
     */
    public static String getCurrentSaleDetails()
    {
        return currentSale.toString();
    }
    
    /**
     * Return items of current sale in list
     * @return 
     */
    public static ArrayList<Item> getItemsOfCurrentSale()
    {
        return currentSale.getSoldItems();
    }
    
    /**
     * Return size of the sale history
     * @return 
     */
    
    public static int getSaleHistorySize()
    {
        return saleHistory.size();
    }
    
    /**
     * Return unmodified list of sale history
     * @return 
     */
    //Use of unmodifiable list
    public static List<String> getSaleHistory()
    {
        List<String> saleHistoryText = new ArrayList<>();
        Collection<Sale> saleHistoryCollection = SalesManager.saleHistory.values();
        saleHistoryCollection.stream().forEach((sale) -> {
            saleHistoryText.add(sale.toString());
        });        
        return Collections.unmodifiableList(saleHistoryText);
    }
}
