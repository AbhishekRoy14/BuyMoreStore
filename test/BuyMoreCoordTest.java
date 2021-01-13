
import core.buyMoreCoord.BuyMoreCoord;
import core.inventory.Item;
import core.inventory.Product;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author royab
 */
public class BuyMoreCoordTest {
    
    public BuyMoreCoordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllGroupNames method, of class BuyMoreCoord.
     */
    @Test(expected = NullPointerException.class)
    public void testGetAllGroupNames() {
        System.out.println("getAllGroupNames");
        List<String> expResult = null;
        List<String> result = BuyMoreCoord.getAllGroupNames();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAllSubgroupNamesOfGroup method, of class BuyMoreCoord.
     */
    @Test (expected = NullPointerException.class)
    public void testGetAllSubgroupNamesOfGroup() {
        System.out.println("getAllSubgroupNamesOfGroup");
        String _groupName = "";
        List<String> expResult = null;
        List<String> result = BuyMoreCoord.getAllSubgroupNamesOfGroup(_groupName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createSalesPerson method, of class BuyMoreCoord.
     */
    @Test
    public void testCreateSalesPerson() {
        System.out.println("createSalesPerson");
        String _name = "";
        BuyMoreCoord.createSalesPerson(_name);
        
    }

    /**
     * Test of setDiscountParameters method, of class BuyMoreCoord.
     */
    @Test
    public void testSetDiscountParameters() {
        System.out.println("setDiscountParameters");
        double cutOffAmount = 0.0;
        double belowDiscountPercent = 0.0;
        double higherDiscountPercent = 0.0;
        BuyMoreCoord.setDiscountParameters(cutOffAmount, belowDiscountPercent, higherDiscountPercent);
        
    }

    /**
     * Test of addItem method, of class BuyMoreCoord.
     */
    @Test(expected = NullPointerException.class)
    public void testAddItem() {
        System.out.println("addItem");
        Item _newItem = null;
        BuyMoreCoord.addItem(_newItem);
        
    }

    /**
     * Test of addProduct method, of class BuyMoreCoord.
     */
    @Test(expected = NullPointerException.class)
    public void testAddProduct() {
        System.out.println("addProduct");
        Product _newProduct = null;
        BuyMoreCoord.addProduct(_newProduct);
        
    }

    /**
     * Test of doesProductExists method, of class BuyMoreCoord.
     */
    @Test
    public void testDoesProductExists() {
        System.out.println("doesProductExists");
        String _brandName = "";
        String _productTypeName = "";
        double _measuredValue = 0.0;
        String _measuredUnit = "";
        boolean expResult = false;
        boolean result = BuyMoreCoord.doesProductExists(_brandName, _productTypeName, _measuredValue, _measuredUnit);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getItem method, of class BuyMoreCoord.
     */
    @Test (expected = NullPointerException.class)
    public void testGetItem() {
        System.out.println("getItem");
        String _itemNumber = "";
        Item expResult = null;
        Item result = BuyMoreCoord.getItem(_itemNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeItem method, of class BuyMoreCoord.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        String _itemNumber = "";
        BuyMoreCoord.removeItem(_itemNumber);
       
    }

    /**
     * Test of addItemToCurrentSale method, of class BuyMoreCoord.
     */
    @Test(expected = NullPointerException.class)
    public void testAddItemToCurrentSale() {
        System.out.println("addItemToCurrentSale");
        String _itemNumber = "";
        BuyMoreCoord.addItemToCurrentSale(_itemNumber);
      
    }

    /**
     * Test of getItemsOfCurrentSale method, of class BuyMoreCoord.
     */
    @Test(expected = NullPointerException.class)
    public void testGetItemsOfCurrentSale() {
        System.out.println("getItemsOfCurrentSale");
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = BuyMoreCoord.getItemsOfCurrentSale();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTotalOfCurrentSale method, of class BuyMoreCoord.
     */
    @Test
    public void testGetTotalOfCurrentSale() {
        System.out.println("getTotalOfCurrentSale");
        double expResult = 0.0;
        double result = BuyMoreCoord.getTotalOfCurrentSale();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getDiscountOfCurrentSale method, of class BuyMoreCoord.
     */
    @Test
    public void testGetDiscountOfCurrentSale() {
        System.out.println("getDiscountOfCurrentSale");
        double expResult = 0.0;
        double result = BuyMoreCoord.getDiscountOfCurrentSale();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of completeCurrentSale method, of class BuyMoreCoord.
     */
    @Test
    public void testCompleteCurrentSale() {
        System.out.println("completeCurrentSale");
        BuyMoreCoord.completeCurrentSale();
        
    }

    /**
     * Test of getSaleHistory method, of class BuyMoreCoord.
     */
    @Test
    public void testGetSaleHistory() {
        System.out.println("getSaleHistory");
        List<String> expResult = null;
        List<String> result = BuyMoreCoord.getSaleHistory();
        assertEquals(expResult, result);
        
    }
    
}
