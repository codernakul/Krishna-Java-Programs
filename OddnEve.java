import java.util.*;
class OddnEve
{
    public static void main()
    { 
        int you=0,comp=0,score=0,points=0; 
        Scanner sc =new Scanner (System.in);
        System.out.println("what would you like to do (Bat or Ball)");
        String choice =sc.next();
        if (choice.equalsIgnoreCase("Bat"))
        {
            System.out.println("Get ready for batting");
            System.out.println("Don't get knocked out on the first ball \n All the best!");
            do
            {
                   System.out.println("Enter your number");
                   you = sc.nextInt();
                   comp=(int) (Math.random()*(7-1))+1;
                   System.out.println("Your number: "+ you);
                   System.out.println("Computer's number: "+comp);
                   score+=you;
                   System.out.println("Your score: " +score);
                   System.out.println("******************************************************");
            }
            while (you !=comp);
            System.out.println("!!OUT!!");
            System.out.println("You did your best");
            System.out.println("Your score: " +score);
            System.out.println("******************************************************");
            System.out.println("now its computer's turn for batting");
            System.out.println("Knock him out on the first ball");
            do
            {
                   System.out.println("Enter your number");
                   you = sc.nextInt();
                   comp=(int) (Math.random()*(7-1))+1;
                   System.out.println("Your number: "+ you);
                   System.out.println("Computer's number: "+comp);                   
                   points+=comp;
                   System.out.println("computer's score: " +points);
                   System.out.println("******************************************************");
                   if (score<points)
                   {
                   System.out.println("you lost  :(");
                   break;
                   }
            }
            while (you !=comp);
        }
            System.out.println("You did your best");
            System.out.println("computer's score: " +points);
            System.out.println("Your score was: "+score);
            System.out.println("******************************************************");
            if(score>points)
            System.out.println("You won!!!YAY  :)");
            else if (score==points)
            System.out.println("well,it's a draw"); 
        
    }
}