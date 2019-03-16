import java.io.*; 

public class ConferenceHall
{
    public static int result(String b[],int k)
    {
        int i,c=0;
        for(i=0;i<b.length;i++)
        {
            if(Integer.parseInt(b[i])<=k)
            c+=1;
        }
        return c;
    }
    public static void main(String[] args) throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a[]=br.readLine().split(" ");
        int n=Integer.parseInt(a[0]);
        int k=Integer.parseInt(a[1]);
        String b[]=br.readLine().split(" ");
        int c=result(b,k);
        System.out.println(c);
    } 
}