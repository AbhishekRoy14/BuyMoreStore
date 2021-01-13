package core.buyMoreCoord;


import core.inventory.Inventory;
import core.inventory.Item;
import core.inventory.Product;
import core.inventory.ProductName;
import core.parameters.Parameters;
import core.sale.Discount;
import core.sale.SalesManager;
import core.sale.SalesPerson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author royab
 */
public class BuyMoreCoord {
    
    /**
     * 
     * @return 
     * returns list of all groups name
     */
    
    public static List<String> getAllGroupNames()
    {
        return Parameters.getAllGroups();
    }
    
    /**
     * 
     * @param _groupName
     * @return 
     * returns list of subgroups name 
     */
    public static List<String> getAllSubgroupNamesOfGroup(String _groupName)
    {
        return Parameters.getSubgroups(_groupName);
    }
    
    //USE CASE: Enter sale’s person name to create sale person object
    public static void createSalesPerson(String _name)
    {
        SalesPerson.createSalesPerson(_name);
    }
    
    //USE CASE: Enter discount parameters (cutoff price and corresponding price) to initialize the  discount scheme of a business day
    public static void setDiscountParameters(double cutOffAmount, double belowDiscountPercent, double higherDiscountPercent)
    {
        Discount.setCutOffAndDiscountPercentages(cutOffAmount, belowDiscountPercent, higherDiscountPercent);
    }
    
     //USE CASE: Add a new Item when necessary
    public static void addItem(Item _newItem)
    {
        Inventory.addItem(_newItem);
    }
    
     //USE CASE: Add a new product when necessary
    public static void addProduct(Product _newProduct)
    {
        Inventory.addProduct(_newProduct);
    }
    
     //USE CASE: Add a new Item and product when necessary
    public static boolean doesProductExists(String _brandName, String _productTypeName,double _measuredValue, String _measuredUnit)
    {
        ProductName productName = new ProductName(_brandName,_productTypeName, _measuredValue, _measuredUnit);
        return Inventory.productsExists(productName);
    }
    
    //USE CASE: Search for an item by item number to view its product name, price, group name, sub group name if found
    public static Item getItem(String _itemNumber)
    {
        return Inventory.getItem(_itemNumber);
    }  
    
    //USE CASE: Remove an existing item 
    public static void removeItem(String _itemNumber)
    {
        Inventory.removeItem(_itemNumber);
    }
    
    //USE CASE: Search for an item by item number and add it to current sale
    public static void addItemToCurrentSale(String _itemNumber)
    {
        Item soldItem = Inventory.getItem(_itemNumber);
        SalesManager.addItemtoCurrentSale(soldItem);
    }
    
    //USE CASE: View the list of item details such as item number, product name, price, group and subgroup, that have been added to the current sale
    public static ArrayList<Item> getItemsOfCurrentSale()
    {
        return SalesManager.getItemsOfCurrentSale();
    }
    
    //USE CASE: View total amount of current sale
    public static double getTotalOfCurrentSale()
    {
        return SalesManager.getTotalAmountOfCurrentSale();
    }
    
    //USE CASE: View discount amount of current sale based on the suitable discounting scheme defined as parameters
    public static double getDiscountOfCurrentSale()
    {
        return SalesManager.getDiscountAmountOfCurrentSale();
    }
    
    //USE CASE: Complete sale to remove the items from the inventory and to add it to sale history for future reference. This also will produce a bill as a text file
    public static void completeCurrentSale()
    {
        SalesManager.completeCurrentSale();
    }
    
    //USE CASE: View sale history consisting of all past sales
    public static List<String> getSaleHistory()
    {
        return SalesManager.getSaleHistory();
    }
}
