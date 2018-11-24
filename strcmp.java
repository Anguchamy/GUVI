import java.io.*;
public class MyClass {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String arr[]=br.readLine().split(" ");
        String a=arr[0];
        String b=arr[1];
        int i,c=1,index;
        index=b.indexOf(a.charAt(0));
        if(index!=0)
        System.out.println(b.length());
        else
        {
        for(i=1;i<a.length();i++)
        {
            index++;
            if(a.charAt(i)==b.charAt(index))
            c+=1;
        }
        System.out.println(b.length()-a.length());
        }
    }
}