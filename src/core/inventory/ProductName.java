
package core.inventory;

/**
 *
 * @author royab
 */

/**
 * ProductName objects represent the product details.
 */

public class ProductName {
    private final String brandName;         // product brand name
    private final String productTypeName;   // product type name
    private final double measuredValue;     // product measured value
    private final String measuredUnit;      // product measured unit
    
    //Constructor
    /**
     * 
     * @param _brandName the product name
     * @param _productTypeName the product type name
     * @param _measuredValue the product measured value in 
     * @param _measuredUnit the product measured unit in 
     */
    
    public ProductName(String _brandName, String _productTypeName, double _measuredValue, String _measuredUnit)
    {
        brandName = _brandName;
        productTypeName = _productTypeName;
        measuredValue = _measuredValue;
        measuredUnit = _measuredUnit;
    }
    
    //New Constructor
    public ProductName(){
        brandName = new String();
        productTypeName = new String();
        measuredValue = 0.0;
        measuredUnit = new String();
    }
    
    //public protocoal 
    
    /**
     * 
     * @return 
     * returns brand name of the product
     */
    public String getBrandName()
    {
        return brandName;
    }
    
    /**
     * 
     * @return 
     * returns type name of the product
     */
    
    public String getProductTypeName()
    {
        return productTypeName;
    }
    
    /**
     * 
     * @return 
     * returns measured value of the product in Double
     */
    public double getMeasuredValue()
    {
        return measuredValue;
    }
    
    /**
     * 
     * @return 
     * returns measured unit of the product
     */
    public String getMeasuredUnit()
    {
        return measuredUnit;
    }
    
    
    
    /**
     * 
     * @param _productName
     * @return 
     */
    public boolean equals(ProductName _productName)
    {
        return (this.brandName == null ? _productName.brandName == null : this.brandName.equals(_productName.brandName)) &&
                this.productTypeName.equals(_productName.getProductTypeName()) &&
                this.measuredValue == _productName.measuredValue &&
                (this.measuredUnit == null ? _productName.measuredUnit == null : this.measuredUnit.equals(_productName.measuredUnit));
    }
    
    /**
     * 
     * @return 
     * returns products brandName, productTypeName, measuredValue and measuredUnit in string value
     */
    @Override
    public String toString()
    {
        return brandName+"_"+productTypeName+"_"+measuredValue+"_"+measuredUnit;
    }
    
    
    
}
