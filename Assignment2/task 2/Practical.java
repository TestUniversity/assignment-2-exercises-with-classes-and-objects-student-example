
/**
 * Week 2 Practical
 * Find and Fix the errors and use this code to answer the questions
 * 
 * @author Sue Grice
 * @version 18/1/06
 */
public class Practical
{
    
    private int x;
    private int number;

    //The main method is the starting point for all Java programs, BlueJ will allow you to run a program without one but
    //it is good practise to use it. This will allow non-BlueJ users to run your program.
    public static void main(String [] args)//String [] args will be explained later, all you need to know is that you need to have it.
    {
        //This will create a new instance of the Practical class and run the constructor
        Practical p = new Practical();
        
        // this calls and runs method1() from the instance p then method 2
        p.method1();
        p.method2();
        
        //this creates a variable and assignes the value returned from getNumber to it
        int numToPrint = p.getNumber();
        System.out.println(numToPrint); // prints out numToPrint
        
        //calls setNumber
        p.setNumber(333);
        
        //numToPrint is now assigned the value from getNumber again
        numToPrint = p.getNumber();
        System.out.println(numToPrint); // prints out numToPrint
    }
    
    /**
     * Constructor for objects of class Practical
     */
    public Practical()
    {
        //This will initalise X to  100 and number to 0
        x = 100;
        number =0;
    }  
    
    /**
     * method1 prints out the word Fred
     */
    private void method1()
    {
        System.out.println(Fred);
    }
    
    /*
     method2 has some errors but where are they?
     can you spot them?*/
    private void method2()
    {
      int y =0;
      y = x *5;
      System.out.println(y);
    }
    //this method sets number 
    private void setNumber(int num)
    {
     number = num;
    }
    
    //this method gets number
    private int getNumber()
    {
     return number;
    }
  
}
