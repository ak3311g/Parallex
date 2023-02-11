import java.util.*;
class threads extends Thread
{
    synchronized void threadsync(int n)
    {
        for(int i=1;i<=10;i++)
        System.out.println(n+" x "+i+" = "+n*i);
        try{
            Thread.sleep(400);
        }
        catch(Exception e)
        {System.out.println(e);}
    }
}
public class p20a{
    public static void main(String[] args) {
        threads obj=new threads();
        Thread t1=new Thread()
        {
            public void run(){
            obj.threadsync(5);
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                obj.threadsync(10);
            }
        };

        t1.start();
        t2.start();
        
    }
}