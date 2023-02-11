import java.util.*;
public class p12 {
    public static void join(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void join(String a,String b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer 1: ");
        int a=sc.nextInt();
        System.out.print("Enter Integer 2: ");
        int b=sc.nextInt();
        System.out.print("Enter String 1: ");
        String c=sc.next();
        System.out.print("Enter String 2: ");
        String d=sc.next();
        join(a,b);
        join(c,d);
    }
}
