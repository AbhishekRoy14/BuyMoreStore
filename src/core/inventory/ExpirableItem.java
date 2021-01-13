
package core.inventory;

import java.util.Date;

/**
 *
 * @author royab
 */


/**
 * ExpirableItem objects represent the expired item.
 */
public class ExpirableItem extends Item {
    // protected protocol
    protected Date expiryDate;  // expirydate of the item
    
    //constructor
    /**
     * Initialize a new ExpirableItem object with the given attribute values.
     * 
     * @param _itemNumber unique number that represent item
     * @param _product product information
     * @param _subgroup subgroup for the item
     * @param _group group for the item
     * @param expiryDate expiry date of the item 
     */
    public ExpirableItem(String _itemNumber, Product _product, String _subgroup, String _group, Date expiryDate)
    {
        super(_itemNumber, _product, _subgroup, _group);
    }    
}
