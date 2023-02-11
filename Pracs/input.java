
import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("You Entered: "+n);
        sc.close();
    }
}