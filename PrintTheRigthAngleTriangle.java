import java.util.Scanner;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("1"+" ");
            }
            System.out.println("");
        }
    }
}
