import java.io.*;
public class MyClass
{
    public static boolean fun(String str, String rev)
    {
        if (str.equals(rev))
        return true;
        else
        return false;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String z=br.readLine();
        int i,n=z.length();
        for(i=0;i<n;i++)
        {
            if(fun(z.substring(0,i),z.substring(i+1,n)))
            {
                System.out.println("YES");
                break;
            }
        }
        if(i==n)
        System.out.println("NO");
    }
}