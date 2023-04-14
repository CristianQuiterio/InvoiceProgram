/*
Cristian Quiterio
1/31/22
A00348313
 */
package invoice;

public class InvoicePrinter
{  
   public static void main(String[] args)
   {  
      String samsAddress =  "Sam's Small Appliances\n100 Main Street" + "\n" + "Anytown CA 98765";

      Invoice samsInvoice = new Invoice(samsAddress);
      samsInvoice.add(new Product("Toaster", 29.95), 3);
      samsInvoice.add(new Product("Hair dryer", 24.95), 1);
      samsInvoice.add(new Product("Car vacuum", 19.99), 2);

      System.out.println(samsInvoice.format());           
   }
}