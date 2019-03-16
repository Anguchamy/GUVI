import java.io.*; 

public class CountofaChar
{
    public static void main(String[] args) throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char a[]=br.readLine().toCharArray();
        char curchar=a[0];
        int i,c=1;
        for(i=1;i<a.length;i++)
        {
            if(curchar==a[i])
            {
                c+=1;
            }
            else
            {
                if(c!=1){
                System.out.print(c+"*"+curchar);
                curchar=a[i];
                c=1;
                }
                else{
                System.out.print(curchar);
                curchar=a[i];
                c=1;
                }
            }
        }
    } 
} 
  