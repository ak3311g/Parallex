import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Multiply m=new Multiply();

        System.out.println("welcome");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("product is: ");
        m.mul(num1,num2);

        System.out.println("enter the record of the student: ");
        String s=sc.nextLine();
        int rnum=sc.nextInt();
        m.getRecord(s,rnum);
        
    }
}
class Multiply{
    void mul(int n1,int n2)
    {
        System.out.println(n1*n2);
    }
    
    void getRecord(String s1,int rollnum)
    {
        System.out.println("Name of the student is: "+s1+" and roll number is: "+rollnum);
    }
}