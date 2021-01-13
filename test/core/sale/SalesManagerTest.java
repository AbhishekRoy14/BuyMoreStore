
package core.sale;

import core.inventory.Item;
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
public class SalesManagerTest {
    
    public SalesManagerTest() {
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
     * Test of addItemtoCurrentSale method, of class SalesManager.
     */
    @Test (expected = NullPointerException.class)
    public void testAddItemtoCurrentSale() {
        System.out.println("addItemtoCurrentSale");
        Item _soldItem = null;
        SalesManager.addItemtoCurrentSale(_soldItem);
        
    }

    /**
     * Test of completeCurrentSale method, of class SalesManager.
     */
    @Test
    public void testCompleteCurrentSale() {
        System.out.println("completeCurrentSale");
        SalesManager.completeCurrentSale();
        
    }

    /**
     * Test of getTotalAmountOfCurrentSale method, of class SalesManager.
     */
    @Test
    public void testGetTotalAmountOfCurrentSale() {
        System.out.println("getTotalAmountOfCurrentSale");
        double expResult = 0.0;
        double result = SalesManager.getTotalAmountOfCurrentSale();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getDiscountAmountOfCurrentSale method, of class SalesManager.
     */
    @Test
    public void testGetDiscountAmountOfCurrentSale() {
        System.out.println("getDiscountAmountOfCurrentSale");
        double expResult = 0.0;
        double result = SalesManager.getDiscountAmountOfCurrentSale();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getCurrentSaleDetails method, of class SalesManager.
     */
    @Test (expected = NullPointerException.class)
    public void testGetCurrentSaleDetails() {
        System.out.println("getCurrentSaleDetails");
        String expResult = "";
        String result = SalesManager.getCurrentSaleDetails();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getItemsOfCurrentSale method, of class SalesManager.
     */
    @Test (expected = NullPointerException.class)
    public void testGetItemsOfCurrentSale() {
        System.out.println("getItemsOfCurrentSale");
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = SalesManager.getItemsOfCurrentSale();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSaleHistorySize method, of class SalesManager.
     */
    @Test
    public void testGetSaleHistorySize() {
        System.out.println("getSaleHistorySize");
        int expResult = 0;
        int result = SalesManager.getSaleHistorySize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSaleHistory method, of class SalesManager.
     */
    @Test
    public void testGetSaleHistory() {
        System.out.println("getSaleHistory");
        List<String> expResult = null;
        List<String> result = SalesManager.getSaleHistory();
        assertEquals(expResult, result);
        
    }
    
}
