import java.util.*;
public class Event {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String spacer = "-----------------------------";
        String eventName;
        int numOfExpenses;
        double expenseTotal = 0;
        double ticketPrice;

        System.out.println(spacer + "\n" + "Welcome to the Event Planner\n" + spacer);
        System.out.println("--> Please enter your event name:");
        eventName = sc.nextLine();

        System.out.println("\nWow! " + eventName + " is a great name!\n");

        System.out.println("--> How many # of expenses do you have?: ");
        numOfExpenses = sc.nextInt();
        String[] expenseName = new String[numOfExpenses]; // Declare our number of expenses to the value
        double[] expensePrice = new double[numOfExpenses]; // Declare our number of expenses to the value


        int i = 0;
        for(i = 0; i < numOfExpenses; i++)
        {
            System.out.println("--> What is the name of expense [#"+(i + 1)+"]");
            expenseName[i] = sc.next();
            
            for(int k = 0; k < 1; k++) // Loop through each cost of our expense
            {
                System.out.println("---> What is the cost of " + expenseName[i]);
                expensePrice[i] = sc.nextDouble();
            }
        }

        
        System.out.println(spacer + "\n " + numOfExpenses + " Total Expenses\n"); // Print out price and name for each expense
        for(i = 0; i < expenseName.length; i++)
        {
            System.out.println("[" + (i + 1) + "] " + expenseName[i] + ": $" + expensePrice[i] );
        }

        for(int g = 0; g < expensePrice.length; g++)
        {
            expenseTotal += expensePrice[g];
        }

        System.out.println("\nEvaluation: $" + expenseTotal );

        System.out.println("\n" + spacer);

        System.out.println("--> What is the cost per ticket?");
        ticketPrice = sc.nextDouble();


        System.out.println(spacer + "\nFinal Evaluation\n");
        double breakEven = EventItem.breakEven(ticketPrice, expenseTotal); // Calculate from our EventItem class
        double profit20 = EventItem.profit20(ticketPrice, expenseTotal); 

        System.out.println("Tickets needed to be sold to break even: " + breakEven);
        System.out.println("Tickets needed to be sold for 20% profit: " + profit20);
        System.out.println("\n" + spacer);
        


    }
}
