
import java.util.Scanner;

class DistFormula
{
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Distance Calculator");
        System.out.println (" ");
        
        System.out.println ("What is the x coordinate of the first point?");
        double xi = sc.nextDouble();
        System.out.println ("What is the y coordinate of the first point?");
        double yi = sc.nextDouble();
        System.out.println ("What is the x coordinate of the second point?");
        double xii = sc.nextDouble();
        System.out.println ("What is the y coordinate of the second point?");
        double yii = sc.nextDouble();
        
        double x = Math.pow((xii -xi),2);
        double y = Math.pow((yii -yi),2);
        double dist = Math.sqrt (x + y);
        System.out.println ("The distance between the two points is " + dist + " units");
        
        
        
    }
}
