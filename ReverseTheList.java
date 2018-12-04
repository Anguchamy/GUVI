import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        
        for(i=n-1;i>=0;i--)
        {
            if(i!=0)
            System.out.print(a[i]+"->");
            else
            System.out.print(a[i]);
        }
    }
}