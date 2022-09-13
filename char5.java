import java.util.*;
class char5
{
    public static void main()
    {
     Scanner sc= new Scanner (System.in);
     System.out.println("Enter a  number ");
     int N = sc.nextInt();
     if(N>0 && N<27)
     {
         int k =64+N;
         char ch = (char)k;
         System.out.println("The letter at place "+N+" is  "+  ch);
        }
     else 
     System.out.println("out of bound! get out!!!!");
    }
}