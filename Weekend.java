import java.util.Scanner;
public class Weekend
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(input.charAt(0)=='S' || input.charAt(0)=='s')
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}