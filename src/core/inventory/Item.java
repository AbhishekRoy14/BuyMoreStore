
package core.inventory;

/**
 *
 * @author royab
 */

/**
 * Item objects represent the item.
 */
public class Item {
    private String itemNumber;  // unique number that represent item
    private Product product;    // product information
    private String subgroup;    // subgroup for the item
    private String group;       // group for the item
    
//constructor
    
    /**
     * Initialize a new item object with the given attribute values.
     *
     * @param _itemNumber  unique number that represent item
     * @param _product product information
     * @param _subgroup subgroup for the item
     * @param _group group for the item
     */
    public Item(String _itemNumber, Product _product, String _subgroup, String _group)
    {
        itemNumber = _itemNumber;
        product = _product;
        subgroup = _subgroup;
        group = _group;
    }
    
    /**
     * 
     * @param _item 
     */
    
    //Copy constructor for deep copying
    public Item(Item _item)
    {
        this(_item.getItemNumber(), _item.getProduct(), _item.getSubgroup(), _item.getGroup());
        
    }

    
//    //New Constructor
//    public Item(String itemNumber, double product, String subgroup, String group) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    //public protocol
    
    /**
     * 
     * @return returns the itemNumber for the item
     */
    public String getItemNumber()
    {
        return itemNumber;
    }
    
    /**
     * 
     * @return 
     * returns the product price
     */
    
    public double getPrice()
    {
        return product.getPrice();
    }
    
    /**
     * 
     * @return product
     * returns new product details
     */
    //Using copy constructor - mutable object is returned
    public Product getProduct()
    {
        return new Product(product);
    }
    
    /**
     * 
     * @return subgroup 
     * returns subgroup of the item
     */
    public String getSubgroup()
    {
        return subgroup;
    }
    
    /**
     * 
     * @return group 
     * returns group of the item
     */
    public String getGroup()
    {
        return group;
    }
   
    /**
     * 
     * @return 
     * returns string value for itemNumber, product, group and subgroup 
     */
    @Override
    public String toString()
    {
        return itemNumber+" | "+product.getName()+" | "+group+" | "+subgroup;
    }
}
