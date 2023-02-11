import java.util.*;
public class p14 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println();
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            if(i>1)
            {
                for(int l=i-1;l>0;l--)
                {
                    System.out.print(l);
                }
            }
        }
        sc.close();
    }
}
