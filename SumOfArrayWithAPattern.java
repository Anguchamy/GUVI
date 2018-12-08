import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        String z=s.nextLine();
        int n=Integer.parseInt(z);
        int i,j=0,sum=0;
        int a[]=new int[z.length()];
        while(n!=0)
        {
            i=n%10;
            a[j]=i;
            n/=10;
            j++;
        }
        n=z.length();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                sum+=a[j];
            }
        }
        System.out.println(sum);
    }
}