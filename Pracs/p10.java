public class p10 {
    public static int check(int n)
    {
        int sq;
        sq=n*n;
        while(n>0)
        {
            if(n%10!=sq%10)
            {
                return 0;
            }
            n=n/10;
            sq=sq/10;
        }
        return 1;
    }
    public static void main(String[] args) {
        int i,n=22;
        i=check(n);
        if(i==0)
        System.out.print(n+" is not automorphic");
        else
        System.out.print(n+" is automorphic");
    }
}
