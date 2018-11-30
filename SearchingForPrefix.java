import java.io.*;
public class MyClass
{
    static int result(char a[],char b[])
    {
        int i,c=0;
        for(i=0;i<b.length;i++)
        {
            if(a[i]==b[i])
            c+=1;
        }
        if(c==b.length)
        return 1;
        return 0;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n=Integer.parseInt(br.readLine());
        String y[]=br.readLine().split(" ");
        String z=br.readLine();
        char q[]=z.toCharArray();
        int f=0,c=0;
        for(i=0;i<n;i++)
        {
            f=result(y[i].toCharArray(),q);
            if(f==1)
            c++;
        }
        System.out.println(c);
    }
}
