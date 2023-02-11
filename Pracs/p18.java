import java.util.*;
class Base
{
    Scanner sc= new Scanner(System.in);
    int a,b;
    Base()
    {
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt();   
    }
}
class Sum extends Base
{
    Sum()
    {
        System.out.println("Sum: "+(a+b));
    }
}
class Difference extends Base
{
    Difference()
    {
        System.out.println("Difference: "+(a-b));
    }
}
public class p18 {
    public static void main(String[] args) {
        Sum ob1 = new Sum();
        Difference ob2 = new Difference();
    }
}
