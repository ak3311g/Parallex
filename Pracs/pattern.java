public class pattern {
    public static void main(String[] args) {
        int i,j,m=5,n=m;
        for(i=0;i<2*m;i++)
        {
            if(i<=m)
            {
                for(j=1;j<=i;j++)
                System.out.print(" *");
            }
            else
            {for(j=1;j<n;j++)
            {
                System.out.print(" *");
            }
            n=n-1;
            }

            System.out.println();
        }
        
    }
}
