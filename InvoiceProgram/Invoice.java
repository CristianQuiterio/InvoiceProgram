/**
 * Describes an invoice for a set of purchased products
 * 
 */
public class Invoice {
    /**
     * Adds a charge for a product to this invoice
     * @param aProduct the product that the customer ordered
     * @param quantity the quantity of the product
     */
    public void add(Product aProduct, int quantity)
    {
        
    }
    
    /**
     * Formats the invoice
     * @return the formatted invoice
     */
    public String format()
    {
         String r = String.format("%32s%n%n", "I N V O I C E");
        return "";
    }
    
    private double getAmountDue()
    {
        return 0;
    }
}
