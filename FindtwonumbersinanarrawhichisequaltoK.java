import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int i,j,f=0;
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]+a[j]==k)
                    {
                        f=1;
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if(f==1)
            break;
        }
        if(f==0)
        System.out.print("NO");
    }
}