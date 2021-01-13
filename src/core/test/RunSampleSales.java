package core.test;

import core.sale.Discount;
import core.inventory.Inventory;
import core.inventory.Item;
import core.parameters.Parameters;
import core.inventory.Product;
import core.sale.SalesManager;
import core.sale.SalesPerson;
import java.util.List;


/**
 * 
 * @author royab
 */

public class RunSampleSales {
    public static void main(String args[])
    {
        //Initialise parameters
        Parameters.initialize();
        
        //Create Sales person
        SalesPerson salesPerson = SalesPerson.getSalesPerson();
        salesPerson.setName("Alex");
        
        //Setting discount thresholds
        Discount.setCutOffAndDiscountPercentages(50.0, 5.0, 10.0);
        
        //Create products
        Product product1 = new Product("Homebrand","Bread", 700, "g", 2.0);
        Product product2 = new Product("Watties", "Ketchup", 100, "ml", 6.0);
        Product product3 = new Product("Gregs", "Coffee", 100, "g", 6.0);
        
        //Add the products to inventory
        Inventory.addProduct(product1);
        Inventory.addProduct(product2);
        Inventory.addProduct(product3);
        
        //Create items
        List<String> groupnames = Parameters.getAllGroups();      
        String groupName1 = groupnames.get(1);
        List<String> subGroupNames1 = Parameters.getSubgroups(groupName1);
        String subGroupName1 = subGroupNames1.get(0);
        Item item1 = new Item("1",product1,groupName1,subGroupName1);
        Item item2 = new Item("2",product1,groupName1,subGroupName1);
        
        String groupName2 = groupnames.get(0);
        List<String> subGroupNames2 = Parameters.getSubgroups(groupName2);
        String subGroupName2 = subGroupNames2.get(0);
        Item item3 = new Item("3",product3,groupName2,subGroupName2);
        
        String groupName3 = groupnames.get(2);
        List<String> subGroupNames3 = Parameters.getSubgroups(groupName3);
        String subGroupName3 = subGroupNames3.get(2);
        Item item4 = new Item("4",product2,groupName3,subGroupName3);
        
        //Add items to the inventory
        Inventory.addItem(item1);
        Inventory.addItem(item2);
        Inventory.addItem(item3);
        Inventory.addItem(item4);
        
        //Create a sale with item1,item2 and item4
        SalesManager.addItemtoCurrentSale(item1);
        SalesManager.addItemtoCurrentSale(item2);
        SalesManager.addItemtoCurrentSale(item4);
        
        System.out.println(SalesManager.getCurrentSaleDetails());

        //Completing this sale
        SalesManager.completeCurrentSale();
        
        //Creating another sale with item 3
        SalesManager.addItemtoCurrentSale(item3);
        
        System.out.println(SalesManager.getCurrentSaleDetails());
        
        //Completing this sale
        SalesManager.completeCurrentSale();
        
        System.out.println("There has been "+ SalesManager.getSaleHistorySize()+" sales today");
        System.out.println("There are " + Inventory.getInventoryItemCount() + " unsold items left in the inventory");
        
    }
}
