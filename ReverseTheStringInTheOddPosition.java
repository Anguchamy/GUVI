import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a[]=s.nextLine().split(" ");
        int i=1;
        StringBuilder br;
        for(i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                br= new StringBuilder(a[i]);
                a[i]=br.reverse().toString();
            }
        } 
        String b=new String();
        for(i=0;i<a.length;i++)
        {
            if(i!=a.length-1)
            b=b+a[i]+" ";
            else
            b+=a[i];
        }
        
        System.out.println(b);
    }
}