import java.lang.Math;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        String z=s.nextLine();
        int n=Integer.parseInt(z);
        int i,sum=0;
        while(n!=0)
        {
            i=n%10;
            sum+=Math.pow(i,4);
            n/=10;
        }
        System.out.println(sum);
    }
}