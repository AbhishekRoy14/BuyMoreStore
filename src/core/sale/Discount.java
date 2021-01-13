
package core.sale;

/**
 * 
 * @author royab
 */

/**
 * Discount objects represent the amount of discount applied on certain amount.
 */
public class Discount 
{
    private static double CutOffSalesPrice;         // Cut of Sale Price for discount to apply
    private static double belowDiscounPercentage;   // Below discount percentage on cutoff total amount
    private static double higherDiscountPercentage; // Higher discount percentage on cutoff total amount
    
   //Constructor
    /**
     * 
     * @param _cutOffPrice cut off price for the discount
     * @param _belowDiscount discount to be applied on amount below cut off price
     * @param _higherDiscount discount to be applied on amount higher cut off price
     */
    public static void setCutOffAndDiscountPercentages(double _cutOffPrice, double _belowDiscount, double _higherDiscount)
    {
        CutOffSalesPrice = _cutOffPrice;
        belowDiscounPercentage = _belowDiscount;
        higherDiscountPercentage = _higherDiscount;
    }
    
    /**
     * 
     * @param _totalPrice total amount of sale
     * @return 
     * returns discount Amount to be applied on the sale
     */
    public static double getDiscountAmount(double _totalPrice)
    {
        double discountAmount = 0.0;
        if(_totalPrice < 0)
        {
            discountAmount = 0;
        }
        else if (_totalPrice < CutOffSalesPrice)
        {
            discountAmount = _totalPrice * (belowDiscounPercentage/100.0);
        }
        else
        {
            discountAmount = _totalPrice * (higherDiscountPercentage/100.0);
        }
        return discountAmount;
    }
}

