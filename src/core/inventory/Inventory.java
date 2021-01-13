
package core.inventory;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author royab
 */

/**
 * Inventory objects represent the inventory item.
 */
public class Inventory {
    private static Map<String, Item> inventoryMap = new HashMap(); // new HashMap for item
    private static Map<String, Product>  productMap = new HashMap(); // new HashMap for product
    private static int uniqueItemNumber = 0;
    
/**
 * 
 * @param _newItem adding Item to the inventory
 * creating uniqueItemNumber...
 * printing out command if item exists
 */
    
    public static void addItem(Item _newItem)
    {
        Item foundItem = inventoryMap.get(_newItem.getItemNumber());
        if ( foundItem == null )
        {
            inventoryMap.put(_newItem.getItemNumber(), _newItem);
            uniqueItemNumber++;
        }
        else
        {
            System.out.println("Item exists. You can't add it again");
        }        
    }
    
 /**
 * 
 * @param _oldItemNumber 
 * removing item from the inventory
 */
    
    public static void removeItem(String _oldItemNumber)
    {
        Item foundItem = inventoryMap.get(_oldItemNumber);
        
        if (foundItem != null)
        {
            inventoryMap.remove(_oldItemNumber);
        }
    }
    
/**
 * Return a new Item, when _itemNumber is found
 * @param _itemNumber getting the itemNunber
 * @return Item
 */
    //Using copy constructor when passing mutable object
    
    public static Item getItem(String _itemNumber)
    {
        Item foundItem = inventoryMap.get(_itemNumber);
        return  new Item(foundItem);
    }
    
    /**
     * 
     * @param _newProduct adding new product to the inventory
     */
    
    public static void addProduct(Product _newProduct)
    {          
        if(!productsExists(_newProduct.getName()))
        {
            productMap.put(_newProduct.getName().toString(), _newProduct);
        }        
    }
    
    /**
     * 
     * @param _productName looking for product through productName
     * @return 
     * returns value of the found product in Boolean
     */
    
    public static boolean productsExists(ProductName _productName)
    {
        Product foundProduct = productMap.get(_productName.toString());
        return foundProduct != null;        
    }
    
    /**
     * 
     * @param _productName
     * @return product
     * returns new product found
     */
    
    //Using copy constructor when passing a mutable object
    public static Product getProduct(String _productName)
    {
        Product foundProduct = productMap.get(_productName);
        return new Product(foundProduct);
    }
    
    /**
     * 
     * @return 
     * returns size of the inventory item count
     */
    
    public static int getInventoryItemCount()
    {
        return inventoryMap.size();
    }
}
