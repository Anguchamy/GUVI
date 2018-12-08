import java.util.Scanner;
public class MyClass 
{
    public static int fun(int a[],int n)
    {
        int i,c=0;;
        for(i=0;i<a.length;i++)
        {
        if(a[i]==n)
        c+=1;
        }
        return c;
    }
    
    public static int max(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
    
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=0,i;
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        for(i=0;i<n;i++)
        m=max(m,fun(a,a[i]));
        
        for(i=0;i<n;i++)
        {
            if(fun(a,a[i])==m)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
