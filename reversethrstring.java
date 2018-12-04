import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a[]=s.nextLine().split(" ");
        String b=a[0];
        a[0]=a[1];
        a[1]=b;
        String c=a[0]+" "+a[1];
        System.out.println(c);
    }
}