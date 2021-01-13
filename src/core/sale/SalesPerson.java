
package core.sale;

/**
 * 
 * @author royab
 */

public class SalesPerson {
    
    private String name;                        //name of the salePerson
    private static SalesPerson salesPerson;     //static salePerson
    
    //To prevent multiple salesPeron objects being created
    protected SalesPerson()
    {
        name = null;
    }
    
    /**
     * Creating a new salePerson
     * @param _name create a new salePerson name
     */
    public static void createSalesPerson(String _name)
    {
        salesPerson = new SalesPerson();
        salesPerson.setName(_name);
    }
    
    /**
     * Returning salePerson
     * @return 
     */
    public static SalesPerson getSalesPerson()
    {
        if (salesPerson == null)
        {
            salesPerson = new SalesPerson();
        }
        return salesPerson;
    }
    
    /**
     * Return name of the salePerson
     * @return 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     * @param _name sets a salePerson name
     */
    public void setName(String _name)
    {
        salesPerson.name = _name;
    }
}
