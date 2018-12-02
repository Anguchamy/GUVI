import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int d=b,c;
        c=0;
        while(true)
        {
            if(d<=a)
            {
                d=d+b;
                c++;
            }
            else
            {
                break;
            }
        }
        System.out.println(c);
    }
}
