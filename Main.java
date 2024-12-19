import javax.swing.JOptionPane;

/*
Data Dictionary:
Final double PROFIT_PERCENTAGE = 0.4
Doubles retailPrice, profit
String input

Ask the user to enter retail price using dailog box
Read input into input
Convert input into a double (since we used a dialog box)
Calculate profit as retailPrice * PROFIT_PERCENTAGE
Display amount of profit
exit program*/

public class Main
{
   public static void main(String[] args)
   {
      final double PROFIT_PERCENTAGE = 0.4;  // Percentage of profit
      double retailPrice;                    // Retail price
      double profit;                         // Amount of profit
      String input;                          // To hold keyboard input
      
      // Get the retail price.
      input = JOptionPane.showInputDialog(
                "Enter the circuit board's retail price: ");
      retailPrice = Double.parseDouble(input);
      
      // Calculate the amount of profit.
      profit = retailPrice * PROFIT_PERCENTAGE;
      
      // Display the amount of profit.
      JOptionPane.showMessageDialog(null, 
                           "Amount of profit: $" + profit);
      
      // Exit the applicaton.
      System.exit(0);
   }
}
