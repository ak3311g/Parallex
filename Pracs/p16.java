class Constructoroverloading
{
    Constructoroverloading()
    {
        System.out.println("Constructor 1");
    }
    Constructoroverloading(int a,int b)
    {
        System.out.println("Constructor 2 called and sum: "+(a+b));
    }
}
public class p16 {
    public static void main(String[] args) {
        Constructoroverloading ob1 = new Constructoroverloading();
        Constructoroverloading ob2 = new Constructoroverloading(12,26);
    }    
}
