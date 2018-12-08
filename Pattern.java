import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            if(i==1)
            System.out.print("1");
            else
            for(j=0;j<(i*2)-1;j++)
            {
            System.out.print("1"+" ");
            }
            System.out.println("");
        }
    }
}