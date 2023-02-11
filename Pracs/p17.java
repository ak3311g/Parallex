import java.util.*;
class Base
{
    Scanner sc = new Scanner(System.in);
    int id;
    Base()
    {
        id = sc.nextInt();
    }
}
class Child1 extends Base
{
    Scanner sc = new Scanner(System.in);
    String name,detail;
    Child1()
    {
        name=sc.next();
        detail=id+" "+name;    }
}
class Child2 extends Child1
{
    Child2()
    {
        System.out.print(detail);
    }
}
public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Child2 ob1 = new Child2();
    }
    
}
