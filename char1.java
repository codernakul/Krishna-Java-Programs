import java.util.*;
class char1
{
    public static void main()
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a character");
     char ch = sc.next().charAt(0);
     int m = (ch+10);
     char ch2= (char)m;
     System.out.println(ch2);
    }
}
     