import java.util.Scanner;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        int j,n=s.nextInt();
        int i,m=s.nextInt();
        int a[][]=new int[n][m];
        int k;
        for(i=0;i<n;i++)
        for(j=0;j<m;j++)
        a[i][j]=s.nextInt();
        
        for(i=0;i<n;i++)
        for(j=0;j<m;j++)
        {
            if(a[i][j]==0)
            {
                for(k=0;k<m;k++)
                a[i][k]=0;
            }
        }
        for(i=0;i<n;i++)
        {
        for(j=0;j<m;j++)
        {
        System.out.print(a[i][j]+" ");
        }
        System.out.println("");
        }
    }
}
