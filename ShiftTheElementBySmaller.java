import java.io.*; 

public class HeapSort 
{
    public static void main(String[] args) throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String b[]=br.readLine().split(" ");
        int i;
        for(i=0;i<b.length-1;i++)
        {
            if(Integer.parseInt(b[i])>Integer.parseInt(b[i+1]))
                System.out.print(b[i+1]+" ");
            else
                System.out.print("-1"+" ");
        }
        System.out.print("-1"+" ");
    } 
}