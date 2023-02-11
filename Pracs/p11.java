import java.util.*;
public class p11 {
    public static int stringcheck(String s1,String s2)
    {
        if(s1.length()==s2.length())
        {
            char a[]=s1.toCharArray();
            char b[]=s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<s1.length();i++)
            {
                if(a[i]!=b[i])
                {return -1;}
            }
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int i;
        String s1="csre",s2="race";
        i=stringcheck(s1, s2);
        if(i==1)
        System.out.print(s1+" "+s2+" are anagram");
        else
        System.out.print(s1+" "+s2+" are not anagram");
    }
}
