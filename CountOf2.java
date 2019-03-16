import java.io.*; 

public class HeapSort 
{
    public static int count(String a)
    {
        int i,c=0;
        for(i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='2')
            c+=1;
        }
        return c;
    }
    public static void main(String[] args) throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int i,c=0;
        String a="";
        for(i=1;i<=n;i++)
        {
            a=Integer.toString(i);
            c+=count(a);
        }
        System.out.println(c);
    } 
}