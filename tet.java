import java.util.*;
class tet 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String s=sc.nextLine();
        
        System.out.println("enter your age");
        int n= sc.nextInt();
        
        System.out.println("enter your favorite game");
        String game = sc.nextLine();
        
        System.out.println("ur name is "+s);
        System.out.println("ur age is " + n);
        System.out.println("ur fav. game is "+game);
    }
}