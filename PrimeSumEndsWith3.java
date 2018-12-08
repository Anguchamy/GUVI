import java.util.Scanner;
public class MyClass 
{
    public static boolean isprime(int n)
    {
        int i;
        for(i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,i;
        for(i=2;i<n;i++)
        {
            if(isprime(i))
                if(i%10==3)
                sum+=i;
        }
        System.out.println(sum);
    }
}
