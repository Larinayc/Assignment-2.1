import java.util.Scanner;

class MortgageCalculator
{
 
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Investment Calculator");
        System.out.println (" ");
        
        System.out.println ("Enter the principle amount in dollars: ");
        double p = sc.nextDouble();
        System.out.println ("Enter the yearly interest rate: ");
        double r = sc.nextDouble();
        System.out.println ("Enter the time of investment in years: ");
        double n = sc.nextDouble();
        
        double amount = p* (Math.pow((1 + r),n));
        System.out.println ("The total amount in your account will be " + amount + " dollars");
    }

    
}
