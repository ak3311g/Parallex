public class palindrom {
public static void main(String[] args) {
    int n=16451,r,temp,result=0;
    temp=n;
    while(temp!=0)
    {
        r=temp%10;
        result=(result*10)+r;
        temp=temp/10;
    }
    if(result==n)
    System.out.println(n+ " is palindrome");
    else
    System.out.println(n+" is not palindrome");
}
}
