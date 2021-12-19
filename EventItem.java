public class EventItem {
    
    // Static method so that we can access it as an object of the class
    public static double breakEven(double tc, double et) // Ticket Cost, Expense Total
    {
        double breakEvenValue = et / tc; // Find how many tickets need to be sold to break even
        return breakEvenValue; // Return it
    }

    public static double profit20(double tc, double et)
    {
        double profit20Value = (et / tc) * .2 + (et / tc);
        return profit20Value;
    }
}
