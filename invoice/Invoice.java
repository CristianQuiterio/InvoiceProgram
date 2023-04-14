/*
Cristian Quiterio
1/31/22
A00348313
*/

package invoice;
import java.util.ArrayList;

public class Invoice {
private String billingAddress;
private ArrayList<LineItem> items;

    public Invoice(String address)
    {
        billingAddress = address;
        items = new ArrayList<LineItem>();
    }
    
    public void add(Product aProduct, int quantity)
    {
        items.add(new LineItem(aProduct, quantity));
    }
    
    public String format()
    {
        String listed = new String();
        double price = 0;
        listed = billingAddress + "\n" + "\n";
        listed = listed + String.format("%-16s%-5s%4s%8s%8s","Description" , "PPU", "QTY", "Price", "Total") + "\n";
        for (LineItem item : items)
        {
            price = price + item.getTotalPrice();
            listed = listed + item.format()+ String.format("%8s" , Double.toString(price)) + "\n";
        }
        
        listed = listed + "\n" + "Amount Due: " + getAmountDue();
        return listed;
    }
    
    public double getAmountDue()
    {
        double amount = 0;
        for (LineItem item : items)
        {
            amount = amount + item.getTotalPrice();
        }
        return amount;
    }
}
