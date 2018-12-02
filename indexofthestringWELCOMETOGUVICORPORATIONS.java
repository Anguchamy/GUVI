import java.util.Scanner;
public class MyClass 
{
    static void funrev(char guvi[][],char a,int n)
    {
        int j,k,flag=0;
        for(j=n-1;j>=0;j--)
        {
            for(k=n-1;k>=0;k--)
            {
                if(guvi[j][k]==a)
                {
                    System.out.println(j+" "+k);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            break;
        }
    }
    static void fun(char guvi[][],char a,int n)
    {
        int j,k,flag=0;
        for(j=0;j<n;j++)
        {
            for(k=0;k<n;k++)
            {
                if(guvi[j][k]==a)
                {
                    System.out.println(j+" "+k);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            break;
        }
    }
    
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        char guvi[][]={
            {'W','E','L','C','O'},
            {'M','E','T','O','G'},
            {'U','V','I','C','O'},
            {'R','P','O','R','A'},
            {'T','I','O','N','S'},
        };
        char a[]=s.nextLine().toCharArray();
        int i=0;
        fun(guvi,a[0],a.length);
        funrev(guvi,a[a.length-1],a.length);
    }
}