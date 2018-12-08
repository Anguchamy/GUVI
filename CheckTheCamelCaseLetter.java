import java.util.Scanner;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        String a[]=s.nextLine().split(" ");
        int c=0;
        for(String b:a)
        {
            if(Character.isUpperCase(b.charAt(0)))
            {
                c+=1;
            }
        }
        if(c==a.length)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
