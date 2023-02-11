public class Armstrong {
    public static void main(String args[])
    {
        int n=371,c=0,r=0,t,ans=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            t=t/10;
            c=c+1;
        }
        t=n;
        while(t!=0)
        {
            r=t%10;
            int a=c;
            int d=r;
            while(a!=1)
            {
                r=r*d;
                a--;
            }
            ans+=r;
            t=t/10;
        }
        if(ans==n)
        System.out.println(n+" is Armstrong");
        else
        System.out.println(n+" is not Armstrong");
    }
}
