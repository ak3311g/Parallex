interface Interface1
{
    void show();
}
class Imple implements Interface1
{
    public void show()
    {
        System.out.println("This is an interface");
    }
    void print()
    {
        System.out.println("This is class");
        show();
    }
}
public class p19 {
    public static void main(String[] args) {
        Imple ob1 = new Imple();
        ob1.print();
    }
}
