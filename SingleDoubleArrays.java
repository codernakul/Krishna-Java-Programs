import java.util.*;
class SingleDoubleArrays
{
    static void main ()
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int [10];
        int b[] = new int[10];
        int c[] = new int[10];
        System.out.println("Enter your Numbers");
        for ( int i =0 ; i<10 ;i++ )
            a[i] = sc.nextInt();
        
        for ( int j=0; j<10 ;j++)
        {
            if (a[j]>10 &&a[j]<=99)
                b[j] = a[j];
            else if (a[j]<=9)
                c[j] = a[j];
        }
        for (int k=0 ; k<10; k++)
        {
            if (b[k]!=0)
            System.out.print(b[k] + "  is a double digit in the array \n");
        }
        System.out.println("");
        for (int l=0 ; l<10; l++)
        {
            if (c[l]!=0)
            System.out.print(c[l] + "  is a single digit number in the array \n");
        }
        
     
    }
}
        