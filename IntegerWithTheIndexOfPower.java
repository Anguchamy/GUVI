import java.util.Scanner;
import java.lang.Math;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        String z=s.nextLine();
        char a[]=z.toCharArray();
        int i,sum=0,n;
        for(i=0;i<a.length;i++)
        {
            n=Character.getNumericValue(a[i]);
            sum+=Math.pow(n,i);
        }
        System.out.print(sum);
    }
}
