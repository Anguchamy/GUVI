import java.io.*;
public class MyClass 
{
    public static int great(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String npqr[]=br.readLine().split(" ");
        int n=Integer.parseInt(npqr[0]);
        int p=Integer.parseInt(npqr[1]);
        int q=Integer.parseInt(npqr[2]);
        int r=Integer.parseInt(npqr[3]);
        String arr[]=br.readLine().split(" ");
        int i,j,k,max=0;
        int z;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(arr[i]);
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        for(k=0;k<n;k++)
        {
            if(i<=j && j<=k)
            {
                max=great(max,((p*a[i])+(q*a[j])+(r*a[k])));
            }
        }
        System.out.println(max);
    }
}
