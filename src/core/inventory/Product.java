
package core.inventory;

/**
 *
 * @author royab
 */

/**
 * Product objects represent the product details.
 */
public class Product {
    private ProductName name;   // name of the product
    private double price;       // price of the product
    
    //Constructor
    /**
     * Initialize a new product object with the given attribute values.
     * 
     * @param _brandName the product brand name
     * @param _productTypeName the product type name
     * @param _measuredValue the product measured value in double
     * @param _measuredUnit the product measured unit 
     * @param _price the product price
     */
    
    public Product(String _brandName, String _productTypeName, double _measuredValue, String _measuredUnit, double _price)
    {
        name = new ProductName(_brandName,_productTypeName, _measuredValue,_measuredUnit );
        price = _price;
    }
    
    /**
     * 
     * @param _product 
     */
    
    //Copy constructor for deep copying
    public Product(Product _product)
    {
        this(_product.name.getBrandName(),_product.name.getProductTypeName(), _product.name.getMeasuredValue(), _product.name.getMeasuredUnit(), _product.getPrice());
    }
    
    
      //New Constructor
    public Product(){
       price = 0.0;
    }
    
    /**
     * 
     * @return name
     * returns the name of the product
     */
    
    public ProductName getName()
    {
        return name;
    }
    
    /**
     * 
     * @return price
     * returns the price of the product
     */
    
    public double getPrice()
    {
        return price;
    }

    public void setName(ProductName name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}