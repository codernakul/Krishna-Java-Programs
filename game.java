import java.util.*;
class game 
{
    public static void main ()
    {Scanner sc=new Scanner(System.in);
        double r;int a;
        System.out.println("enter a number between 1 and 10");
        for(int i=1;i<=10;i++)
        { 
        a=sc.nextInt();
        r=Math.random()*10;
        int n=(int)r;
        if (a>=0&&a<=9)
        {
            if(n==a)
        System.out.println("inputed number is equal to the random number generated");
        else if(a>n)
        System.out.println("inputed number is greater than the random number generated ");
        else if (a<n)
        System.out.println("inputed number is less than the random number generated ");
        }
    else
    System.out.println("input is wrong");
}
}}