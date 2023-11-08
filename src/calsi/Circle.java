package calsi;
import java.util.Scanner;
public class Circle{
    public static void main(String[] args)
 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
       double pi = Math.PI;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is anudeep : " + area);
    }
}
