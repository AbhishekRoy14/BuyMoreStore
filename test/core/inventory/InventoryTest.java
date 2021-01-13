
package core.inventory;

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
public class InventoryTest {
    
    public InventoryTest() {
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
     * Test of addItem method, of class Inventory.
     */
    @Test (expected = NullPointerException.class)
    public void testAddItem() {
        System.out.println("addItem");
        Item _newItem = null;
        Inventory.addItem(_newItem);
       
    }

    /**
     * Test of removeItem method, of class Inventory.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        String _oldItemNumber = "";
        Inventory.removeItem(_oldItemNumber);
       
    }

    /**
     * Test of getItem method, of class Inventory.
     */
    @Test (expected = NullPointerException.class)
    public void testGetItem() {
        System.out.println("getItem");
        String _itemNumber = "";
        Item expResult = null;
        Item result = Inventory.getItem(_itemNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addProduct method, of class Inventory.
     */
    @Test (expected = NullPointerException.class)
    public void testAddProduct() {
        System.out.println("addProduct");
        Product _newProduct = null;
        Inventory.addProduct(_newProduct);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of productsExists method, of class Inventory.
     */
    @Test (expected = NullPointerException.class)
    public void testProductsExists() {
        System.out.println("productsExists");
        ProductName _productName = null;
        boolean expResult = false;
        boolean result = Inventory.productsExists(_productName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProduct method, of class Inventory.
     */
    @Test (expected = NullPointerException.class)
    public void testGetProduct() {
        System.out.println("getProduct");
        String _productName = "";
        Product expResult = null;
        Product result = Inventory.getProduct(_productName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getInventoryItemCount method, of class Inventory.
     */
    @Test
    public void testGetInventoryItemCount() {
        System.out.println("getInventoryItemCount");
        int expResult = 0;
        int result = Inventory.getInventoryItemCount();
        assertEquals(expResult, result);
       
        
    }
    
}
