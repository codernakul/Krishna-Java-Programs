/*author-krishna
   */
import java.util.*;
public class unique
{
    public static void main(String[] args)
    {
        int input[]=new int [10];
        int output[]=new int [10];
        
        Scanner sc=new Scanner(System.in);
        
        int ucount=0;

        for(int i=0;i<=9;i++)
        {
            System.out.println("Enter number on index "+i);
            input[i]=sc.nextInt();
        }

        int num,c,flag=0;
        
        for(int j=0;j<=9;j++)
        {
            for(int i=0;i<=9;i++)
            {
                num=input[j];
                c=0;
                while(num!=0)
                {
                    if(num%10==i)
                        ++c;
                    num=num/10;
                }
                if(c>1)
                    ++flag;
            }
            if(flag==0)
                output[ucount++]=input[j];
            else
                flag=0;
        }
        
        System.out.println("Unique Numbers:");

        for(int i=0;i<ucount;i++)
        {
            System.out.println(output[i]);
        }
    }
}