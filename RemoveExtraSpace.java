import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        char a[]=s.nextLine().toCharArray();
        int f=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='a' && a[i]<='z')
            {
                System.out.print(a[i]);
                f=0;
            }
            else if(a[i]==' ' && f==0)
            {
                System.out.print(a[i]);
                f=1;
            }
        }
    }
}
