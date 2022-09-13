import java.util.*;
class char2
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character");
        char ch = sc.next().charAt(0);
        System.out.println("Next five characters are :");
        for (int i=1; i<=5; i++)
        {
            int k = ch+i;
            char c =(char)k;
            System.out.println(c);
        }
    }
}