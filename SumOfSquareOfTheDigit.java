import java.util.Scanner;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,i;
        while(n!=0)
        {
            i=n%10;
            sum+=i*i;
            n/=10;
        }
        System.out.println(sum);
    }
}
