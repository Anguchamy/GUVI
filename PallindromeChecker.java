import java.io.*;
public class MyClass
{
    public static boolean fun(String str)
    {
        String rev="";
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
        rev = rev + str.charAt(i);
        
        if (str.equals(rev))
        return true;
        else
        return false;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char a[]=br.readLine().toCharArray();
        int i,j,n=a.length;
        for(i=0;i<n;i++)
        {
            String b=new String();
            for(j=0;j<n;j++)
            {
                if(i!=j)
                    b+=a[j];
            }
            if(fun(b))
            {
                System.out.println("YES");
                break;
            }
        }
        if(i==n)
        System.out.println("NO");
    }
}
