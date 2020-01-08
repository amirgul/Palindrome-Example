import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        char[] anArray = new char[80];
        int i = 0;
        boolean isTrue = isPalindrome(anArray, i);
        System.out.println("answer: " + isTrue);;
        //System.out.println(isPalindrome(anArray,i));
        System.out.println(i);


    }
    public static boolean isPalindrome(char[] anArray, int used)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean isTrue = true;
         used = 0;
        System.out.println("Enter char for index: " + (used));
        anArray[used] = keyboard.next().charAt(0);
        while (anArray[used] != '.')
        {
            used++;
            System.out.println("Enter char for index: " + (used));
            anArray[used] = keyboard.next().charAt(0);

        }
        for(int i = used-1; i>=0; i--)
        {
            if(anArray[i] != anArray[used - (i+1)] )
            {
                isTrue = false;
            }
            else
                isTrue = true;
        }
       // System.out.println("uese: "+ used);
        return isTrue;



    }
}
