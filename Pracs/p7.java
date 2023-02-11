public class p7 {
    public static void main(String[] args) {
        int i,j,n=5,t=n;
        for(i=1;i<n*2;i++)
        {
            if(i<n)
            {
                for(j=1;j<=t;j++)
                System.out.print(j+" ");
                t=t-1;
            }
            else
            {
                for(j=1;j<=t;j++)
                System.out.print(j+" ");
                t=t+1;
            }
            System.out.println();
        }
    }
}
