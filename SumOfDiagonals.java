a=input()
b=""
c=""
for i in range(len(a)):
    if a[i] not in b:
        c+=a[i]
        b+=a[i]

print(c[::-1])import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        int a[][]=new int[n][n];
        
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            a[i][j]=s.nextInt();
            
        j=0;
        for(i=0;i<n;i++)
        j+=a[i][i];
        
        System.out.println(j);
    }
}
