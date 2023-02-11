public class p9 {
    public static void main(String[] args) {
        int b,r,n=2026,l,t;
        String a=" ";
        a=String.valueOf(n);
        l=a.length();
        t=n;
        a="";
        if(l%2==0)
        {
            for(int i=l;i>l/2;i--)
            {
                r=t%10;
                a=String.valueOf(r)+a;
                t=t/10;
            }
            b=Integer.parseInt(a);
            t=t+b;
            t=t*t;
            if(t==n)
            System.out.println(n+" is Tech Number");
            else
            System.out.println(n+" is not a Tech Number");
        }
        else
        System.out.println(n+" is not a Tech Number");
    }    
}
