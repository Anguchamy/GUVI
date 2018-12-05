import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int a[]=new int[n];
        int b[]=new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        for(i=0;i<n;i++)
        b[i]=s.nextInt();
        
        for(i=0;i<n;i++)
        System.out.print(a[i]+b[i]+" ");
    }
}
