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
        int i;
        for(i=2;i<=n;i++)
        {
            if(isprime(i))
            System.out.print(i+" ");
        }
    }
}
