import java.util.Scanner;
import java.lang.Math;
public class Alan{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String z=s.nextLine();
        int n=Integer.parseInt(z),i;
        int j=z.length()-1;
        int a[]=new int[z.length()];
        while(n!=0)
        {
            i=n%10;
            a[j]=i;
            n/=10;
            j--;
        }
        j=0;
        n=z.length();
        for(i=0;i<n;i++)
        {
            if(i==n-1)
            j+=(int)Math.pow(a[i],a[0]);
            else
            j+=(int)Math.pow(a[i],a[i+1]);
        }
        System.out.println(j);
    }
}