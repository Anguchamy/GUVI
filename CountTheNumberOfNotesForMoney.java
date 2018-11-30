import java.io.*;
public class MyClass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int i,c=0;
        int b[]={1000,500,100,50,10,1};
        for(i=0;i<b.length;i++)
        {
            if(a!=0)
            while(true)
            {
                if(b[i]<=a)
                {
                    a-=b[i];
                    c+=1;
                }
                else
                break;
            }
            else
            break;
        }
        System.out.println(c);
    }
}