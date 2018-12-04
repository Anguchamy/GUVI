import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        String a[]=s.nextLine().split(" ");
        char r='0';
        String result=new String();
        if(a[0].length()-a[1].length()!=0)
        {
            if(a[0].length()>a[1].length())
            r='a';
            else
            r='b';
        }
        int i,diff;
        if(r=='0')
        {
            for(i=0;i<a[0].length();i++)
            {
                result+=a[0].charAt(i);
                result+=a[1].charAt(i);
            }
            System.out.print(result);
        }
        else if(r=='a')
        {
            diff=a[0].length()-a[1].length();
            for(i=1;i<=diff;i++)
            a[1]+=Integer.toString(i);
            
            for(i=0;i<a[0].length();i++)
            {
                result+=a[0].charAt(i);
                result+=a[1].charAt(i);
            }
            System.out.print(result);
        }
        else
        {
            diff=a[1].length()-a[0].length();
            for(i=1;i<=diff;i++)
            a[0]+=Integer.toString(i);
            
            for(i=0;i<a[0].length();i++)
            {
                result+=a[0].charAt(i);
                result+=a[1].charAt(i);
            }
            System.out.print(result);
        }
    }
}
