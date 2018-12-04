import java.util.*;
public class MyClass 
{
    static int fun(int n)
    {
        int i,c=0;
        while(n!=0)
        {
            i=n%10;
            n=n/10;
            if(i==2)
            c+=1;
        }
        return c;
    }
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,c=0;
        for(i=2;i<=n;i++)
        {
            c=c+fun(i);
        }
        System.out.println(c);
    }
}
