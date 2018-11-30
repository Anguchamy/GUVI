import java.io.*;
public class MyClass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String r="";
        int max=0;
        while(true)
        {
            try{
                String a[]=br.readLine().split("#");
                int s=Integer.parseInt(a[1])+Integer.parseInt(a[2])+Integer.parseInt(a[3]);
                if(max<s)
                {
                    r=a[0];
                    max=s;
                }
            }
            catch(NullPointerException e) 
            {break;}
        }
        System.out.println(r);
    }
}
