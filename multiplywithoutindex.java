import java.util.Scanner;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        int j,i,n=s.nextInt();
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        int p=1;
        for(i=0;i<n;i++)
        {
            p=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                p*=a[j];
            }
            System.out.print(p+" ");
        }
    }
}
