import java.io.*;
public class MyClass {
    public static void main(String args[])throws IOException 
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String a=br.readLine();
        String b=br.readLine();
        String c=new String();
        int i,j;
        for(i=0;i<a.length();i++)
        {
            j=a.charAt(i)-96+b.charAt(i)-96;
            if(j>26)
            {
                j=(j-26);
                c=c+(char)((j)+96);
            }
            else
            c=c+(char)((j)+96);
        }
        System.out.println(c);
    }
}
