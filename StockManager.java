import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        boolean existingID = false;
        
        for (Product product : stock) {
            if (product.getID() == item.getID()) {
                existingID = true;
                System.out.println("Sorry, this ID is already in our Stock");
                break;
            }
            
        }
        
        if (!existingID) {
            stock.add(item);
        }
        
        
    }
    
    public void printProductDetails(){
     
     for (Product product : stock){
         System.out.println(product.toString());
         
        }
        
    }
    
    public void printBelowStockDetails(int quantity) {
     
        for (Product product : stock) {
         
         if (product.getQuantity() < quantity) {
             
             System.out.println(product.toString());
             
            }
            
        }
        
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        
        for (Product product : stock){
         
            if (product.getID() == id){
                System.out.println(product.getName() + " returned.");
                return product;
            } else 
            return null;    
            
            
        }
        
        return null;
    }
    
    public Product findProduct (String _name){
     
        for (Product product : stock) {
         
            String name = product.getName();
            
            if (name.equals(_name)){
                return product;
            }
            
        }
        
        System.out.println("No Product in our stock matches the searched Name");
        return null;
        
    }
    
    public void print1To10(){
     
        int i = 1;
        
        do {
         
         System.out.println(i);
         i++;
            
        } while (i <= 10);
        
        
    }
    
    public void switchCaseExample(String _menuItemName) {
        // Super Rough menu search
        switch (_menuItemName) {
            
            case "Burger" :
            System.out.println("We have burgers!");
            break;
            
            case "Salad" :
            System.out.println("We Do not have Salads");
            break;
            
            case "Pizza with Pineapple" :
            System.out.println("I'm sorry, but we must ask you to leave");
            // Customer.kickOutOfStore();
            break;
            
            default :
            System.out.println("No Products matched that name");
            
        }
        
    }
    
    public int numberInStock(int id){
     
     Product product = findProduct(id);   
     
     if (product != null){
         return product.getQuantity();
        }
        
     else 
        return 0;
        
    }
    
    public void delivery(int id, int quantity){
        
        Product product = findProduct(id);
        
        if (product != null) {         
         product.increaseQuantity(quantity);   
         
        }
        
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */

    /**
     * Print details of all the products.
     */
}
