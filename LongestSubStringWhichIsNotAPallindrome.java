import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        StringBuilder b=new StringBuilder(a);
        String c=b.reverse().toString();
        int n=a.length();
        if(c.equals(a))
        System.out.print(a.substring(0,n-1));
        else
        System.out.print(c);
    }
}