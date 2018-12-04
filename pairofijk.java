import java.util.Scanner;
import java.lang.Math;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,c=0,k;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    if(i<j && j<k)
                    if(a[i]+a[j]==a[k])
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}
