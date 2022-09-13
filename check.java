import java.util.*;
class check
{
    public static void main()
    { 
        int m=0,s=0,f=1;
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (true)
        {
            System.out.println("input your number ,press 0 to exit ");
            int n= sc.nextInt();
            if(n!=0)
            {
                a.add(n);
            }
            else 
            {
                System.out.println("As you have entered 0 , the program will terminate \n ");
                break;
            }
        }
        System.out.println("Numbers stored in the array are :");
        for(int k=0 ; k<a.size();k++)
        {
            System.out.print(a.get(k)+"\t");
        }
        System.out.println("\n");
        for(int j=0 ; j<a.size();j++)
        {
            if(a.get(j)<=7)
            {
                for(int b=1;b<=a.get(j);b++)
                    f=f*b;
            }
            if(a.get(j)<=7)
            System.out.println("the factorial of "+ a.get(j) +" is : "+ f);
            f=1;
        }
        for(int i=0 ; i<a.size();i++)
        {
            if(a.get(i)%5==0 )
                s=s+a.get(i);
        }
        System.out.println("the sum of all numbers divisible by 5 are : "+ s);
    }
}