/*
Cristian Quiterio
1/31/22
A00348313
 */
package invoice;

public class LineItem {

    private int quantity;
    private Product theProduct;

    public LineItem(Product aProduct, int aQuantity) {
        quantity = aQuantity;
        theProduct = aProduct;
    }

    public double getTotalPrice() {
        return theProduct.getPrice() * quantity;
    }

    public String format() {
        
        return String.format("%-16s%5s%4s%8s" ,theProduct.getDescription(), Double.toString(theProduct.getPrice()), Integer.toString(quantity), Double.toString(getTotalPrice()));
    }

}
