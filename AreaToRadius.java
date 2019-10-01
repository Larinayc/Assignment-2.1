import java.util.Scanner;

class AreaToRadius
{
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Area to Radius Calculator");
        System.out.println (" ");
        
        System.out.println ("Enter the area of the circle: ");
        double area = sc.nextDouble();
        double radius = Math.sqrt (area / (Math.PI) );
        System.out.println ("The radius of the circle is " + radius);
        
        
    }
}
