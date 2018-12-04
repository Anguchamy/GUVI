import java.util.*;
public class MyClass 
{
    static boolean isprime(int n)
    { 
        if (n <= 1) 
            return false; 

        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
    
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,c=0;
        for(i=1;i<=n/2;i++)
        {
            if(isprime(i))
            for(j=1;j<n;j++)
            {
                if(isprime(j))
                    if(i+j==n)
                    c+=1;
            }
        }
        System.out.print(c);
    }
}
