/*
 Cristian Quiterio
1/31/22
A00348313
 */
package invoice;

public class Product {
    private String description;
    private double price;
    
    public Product(String aDescription, double aPrice)
    {
        description = aDescription;
        price = aPrice;
    }
    public String getDescription() 
   {
      return description;
   }

   public double getPrice() 
   {
      return price;
   }
    
}
