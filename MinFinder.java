import java.io.*;
public class MinFinder
{
    static int min(int a, int b)
    {
        if(a>b)
        return b;
        else
        return a;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,n=Integer.parseInt(br.readLine());
        String b[]=br.readLine().split(" ");
        int c[]=new int[n];
        for(i=0;i<n;i++)
        c[i]=Integer.parseInt(b[i]);
        
        String b1[]=br.readLine().split(" ");
        int u=Integer.parseInt(b1[0]);
        int v=Integer.parseInt(b1[1]);
        
        System.out.println(min(u,v));
    }
}
