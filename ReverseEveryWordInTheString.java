import java.util.Scanner;
import java.lang.Math;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        String a[]=s.nextLine().split(" ");
        StringBuilder br;
        for(int i=0;i<a.length;i++)
        {
            br=new StringBuilder(a[i]);
            a[i]=br.reverse().toString();
        }
        String b=new String();
        for(String g:a)
        b=b+g+" ";
        System.out.print(b);
    }
}
