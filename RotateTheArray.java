import java.util.*;
public class MyClass 
{
    static void fun(int a[],int n)
    {
        int i,j;
        j=a[0];
        for(i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=j;
    }
    
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,d=s.nextInt();
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        for(i=0;i<d;i++)
        fun(a,n);
        
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
