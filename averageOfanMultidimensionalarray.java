import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,n=s.nextInt();
        double su=0;
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
                su+=a[i][j];
            }
        }
        su=su/(n*n);
        System.out.println(String.format("%.6f",su));
    }
}