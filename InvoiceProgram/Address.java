/**
 * 
 * Describes a mailing address
 */
public class Address {
    
    public Address()
    {
        
    }
    
    
    /**
     * Formats the address.
     * @return the address as a string with three lines
     */
    public String format()
    {
        return String.format("%s%n%s%n%S", "%s", "%s" );
    }
}
