import java.util.Scanner;
public class Alan{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String a[]=s.nextLine().split(" ");
        String b;
        int i;
        for(i=0;i<a.length;i++)
        {
            String c=new String(a[i]);
            a[i]=c.toLowerCase();
        }
        for(i=0;i<a.length-1;i++){
            if(a[i].charAt(0)>a[i+1].charAt(0)){
                b=a[i];
                a[i]=a[i+1];
                a[i+1]=b;
            }
        }
        for(i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}