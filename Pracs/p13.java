class Parent
{
    void print()
    {
        System.out.println("This is Parent");
    }
}
class Child extends Parent
{
    void print()
    {
        System.out.println("This is Child");
    }
}
public class p13 {
    public static void main(String[] args) {
        Parent ob1=new Parent();
        Parent ob2=new Child();
        ob1.print();
        ob2.print();
    }
}
