import java.util.*;
public class MyClass 
{
    static void sortbyrow(int a[][],int r,int c)
    {
        int i,j,t;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c-1;j++)
            {
                if(a[i][j]>a[i][j+1])
                {
                    t=a[i][j];
                    a[i][j]=a[i][j+1];
                    a[i][j+1]=t;
                }
            }
        }
    }
    
    static void sortbycolumn(int a[][],int r,int c)
    {
        int i,j,t;
        for(i=0;i<c;i++)
        {
            for(j=0;j<r-1;j++)
            {
                if(a[j][i]>a[j+1][i])
                {
                    t=a[j][i];
                    a[j][i]=a[j+1][i];
                    a[j+1][i]=t;
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int i,j;
        int a[][]=new int[r][c];
        
        for(i=0;i<r;i++)
        for(j=0;j<c;j++)
        a[i][j]=s.nextInt();
        
        sortbyrow(a,r,c);
        sortbycolumn(a,r,c);
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}