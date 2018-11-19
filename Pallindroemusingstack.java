import java.util.Stack;
import java.util.Scanner;
public class PalindromeTest {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) 
        {
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";

        while (!stack.isEmpty()) 
        {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}