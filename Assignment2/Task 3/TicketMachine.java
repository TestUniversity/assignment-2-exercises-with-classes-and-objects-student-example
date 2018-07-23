
/**
 * A program to print out a ticket
 * 
 * @author "Cham Tat Cheng"
 * @version 22/6/18
 */

public class TicketMachine
{
    private int refund;
    private int price;
    private int balance;
    private int total;
 
    
    
    /**
     * Constructor for objects of class TicketMachine
     */
    public TicketMachine(int ticketCost)
    {
        // initialise instance variables
       price = ticketCost;
       balance = 0;
       total = 0;
       
    }

    /**
     * callMethods  
     * a director method that determines the order the methods are called in
     * and directs the 'flow' of the program, the constructor need not be called as 
     * it is called when an instance of the class is created.
     * @param     none
     * @return    none
     */
    public void callMethods()
    {
        //call the method insertMoney and pass in the value 100
        insertMoney(100);
        printTicket();
    }
    
    /**
     * getPrice 
     * returns the price 
     * this method would be called from other classess to get the value stored in price.
     * @param     none
     * @return    price
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * insertMoney 
     * sets the balance
     * @param     amount
     * @return    none
     */
    public void insertMoney(int amount)
    {
        balance +=amount;   
    }
    
    
    /**
     * printTicket 
     * prints out ticket and updates total and clears the balance 
     * @param     none
     * @return    none
     */
    public void printTicket()
    {
    // Simulate the printing of a ticket.
    System.out.println("##################");
    System.out.println("# The BlueJ Line");
    System.out.println("# Ticket");
    System.out.println("# " + price + " cents.");
    System.out.println("##################");
    System.out.println();
    // Update the total collected with the balance.
    total += balance;
    
    //call refundBalance
    refund = refundBalance();
    //this will ensure that the excess cash inserted will be returned to customer
    
    
    //print out the amount to be refunded
   //System.out.println("refundBalance");
   
    
    // Clear the balance.
    balance = 0;
  } 

  
  /**
     * refundBalance 
     * refunds the balance 
     * @param     none
     * @return    amountToRefund
     */
  public int refundBalance()
{
    int amountToRefund;
    
    //Sort out the line of code below so that it will provide the correct amountToRefund
    amountToRefund =balance;
    
    if (balance > 0)
    {
        return amountToRefund;
    }
    else
    {
        return 0;
    }
} 

    
}
