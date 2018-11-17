import java.util.*;
import java.io.*;
public class addoreven
{
public static void main(String aaa[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
if(n==0)
System.out.println("0");
else if(n>0)
System.out.println("Positive");
else 
System.out.println("Negative");
}
}