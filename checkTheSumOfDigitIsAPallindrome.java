import java.util.*;
public class MyClass 
{
    static boolean ispalindrome(int n)
    {
        int m=n;
        int i,rev=0;
        while(n!=0)
        {
            i=n%10;
            rev=rev*10+i;
            n/=10;
        }
        if(rev==m)
        return true;
        return false;
    }
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,i;
        while(n!=0)
        {
            i=n%10;
            sum+=i;
            n/=10;
        }
        if(ispalindrome(sum))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
