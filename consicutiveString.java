import java.io.*;
import java.util.*;
public class MyClass 
{
    public static long result(long m[])
    {
        int i;
        long ma=m[0];
        for(i=1;i<m.length;i++)
        {
            if(m[i]>ma)
            {
                ma=m[i];
            }
        }
        return ma;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        char n[]=br.readLine().toCharArray();
        String a="";
        String r="";
        long []m;
        long max;
        int i,j;
        for(i=0;i<n.length-1;i++)
        {
            if(n[i]==n[i+1])
            {
                a+=i;
                a+=i+1;
            }
        }
        int h;
        m=new long[a.length()];
        for(i=0;i<a.length();i++)
        {
            h=Integer.parseInt(String.valueOf(a.charAt(i)));
            for(j=0;j<n.length;j++)
            {
                if(h!=j)
                {
                    r+=n[j];
                }
            }
            m[i]=Long.parseLong(r);
            r="";
        }
        max=result(m);
        System.out.println(max);
    }
}