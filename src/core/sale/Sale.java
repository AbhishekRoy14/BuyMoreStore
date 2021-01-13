
package core.sale;

import core.inventory.Inventory;
import core.inventory.Item;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author royab
 */

/**
 * Sale objects represent details regarding sale.
 */
public class Sale {
    private ArrayList<Item> soldItems;  // Array List of item sold
    private int saleID;                 // sale ID
    private Date date;                  // sale date
    private int gstNumber;              // sale GST Number
    private double totalAmount;         // sale total amount
    private double discountAmount;      // discount amount on the total sale
    private double amountPayable;       // amount to be paid
    
    //Constructor
    /**
     * 
     * @param _saleID the saleID 
     * @param _gstNumber 
     */
    public Sale(int _saleID, int _gstNumber)
    {
        saleID = _saleID;
        gstNumber = _gstNumber;
        date = new Date();
        soldItems = new ArrayList<>();
        totalAmount = 0.0;
        discountAmount = 0.0;
    }
    
    /**
     * 
     * @param _saleID sale ID of the sale
     * @param _gstNumber GST Number of the sale
     * @param _date Date applied on the sale
     * @param _totalAmount total amount of the sale
     * @param _discountAmount discount amount on the total amount of sale
     * @param _amountPaid payable amount after discount
     * @param _soldItems number of items sold
     */
    //Private constructor for copy constructor below
    private Sale(int _saleID, int _gstNumber, Date _date, double _totalAmount, double _discountAmount, double _amountPaid, ArrayList<Item> _soldItems)
    {
        saleID = _saleID;
        gstNumber = _gstNumber;
        date = _date;
        totalAmount = _totalAmount;
        discountAmount = _discountAmount;
        amountPayable = _amountPaid;
        soldItems = _soldItems;
    }
    
    //Copy constructor for deep copying
    public Sale(Sale _sale)
    {
        this(_sale.getSaleID(), _sale.getGSTNumber(), _sale.date, _sale.getTotalAmount(), _sale.getDiscount(), _sale.getAmountPayable(), _sale.getSoldItems());
    }
    
    public void addItemAndUpdateSale(Item _item)
    {
        soldItems.add(_item);
        Inventory.removeItem(_item.getItemNumber());
        totalAmount = totalAmount + _item.getPrice();
        discountAmount  = Discount.getDiscountAmount(totalAmount);
        amountPayable = totalAmount - discountAmount;
    }
    
    /**
     * Return the sold item count
     * @return 
     */
    public int getCountOfItems()
    {
        return soldItems.size();
    }
    
    /**
     * Return the Sale ID of the sale
     * @return 
     */
    public int getSaleID()
    {
        return saleID;
    }
    
    /**
     * Return GST Number of the sale
     * @return 
     */
    public int getGSTNumber()
    {
        return gstNumber;
    }
    
    /**
     * Return Total Amount of the sale
     * @return 
     */
    public double getTotalAmount()
    {
        return totalAmount;
    }
    
    /**
     * Return discount amount on the total amount
     * @return 
     */
    public double getDiscount()
    {
        return discountAmount;        
    }
    
    /**
     * Return Amount Payable of the sale, 
     * after discount has been applied on Cut Off amount
     * @return 
     */
    public double getAmountPayable()
    {
        return amountPayable;
    }
    
    /**
     * Return list of sold item
     * @return 
     */
    //Returning copy of sold items since mutable
    public ArrayList<Item> getSoldItems()
    {
        return new ArrayList<>(soldItems);
    }
    
    /**
     * saleID, GST Number, Date, salePerson, soldItemList,
     * total Amount and Discount in String.
     * @return      
     */
    @Override
    public String toString()
    {        
        String saleIDText = "ID: "+ saleID +"\n";
        String saleGSTNumberText = "GST Number :"+ gstNumber+ "\n";
        String saleDateText = "Date: "+ (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(date) + "\n";
        String salePersonText = "Sold by: "+SalesPerson.getSalesPerson().getName()+ "\n\n\n";
        
        String soldItemListText = "";
        for(Item item: soldItems)
        {
            soldItemListText = soldItemListText + item.toString() + "\n";
        }
        
        String totalText = "\nTotal Amount: " + totalAmount;
        String discountText = "\nDiscount: " + discountAmount;
        String divisionLine = "\n_________________________________________________________";
        
        return saleIDText + saleGSTNumberText + saleDateText + salePersonText + soldItemListText + totalText + discountText + divisionLine;
    }
}
