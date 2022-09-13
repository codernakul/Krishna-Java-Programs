import java.util.*;
class SingleDouble
{
    static void main () 
    { int m = 0 , n = 0;
        Scanner input = new Scanner (System.in);
        int a[] = new int [10];
        int b[] = new int [m];
        int c[] = new int [n]; 
        System.out.println("Enter your Numbers");
        for ( int i=0 ; i<10 ; i++ )
        a[i] = input.nextInt();

        for ( int j=0; j<10 ; j++ )
        {
            if ( a[j]>9 && a[j]<99 )
            b[m] = a[j];
            m++;
        }
        for ( int k=0 ; k<10 ;k++)
        {
            if ( a[k]<10 )
            {
                c[n] = a[k];
                n++;
            }
        }
        int l , r ;
        for ( l = 0 ; l<n; l++)
        System.out.println("all single digit numbers are ");
        {
            System.out.println(c[l]);
        }
        for ( r = 0 ; r<m ; r++)
        System.out.println("all double digit numbers are ");
        {
            System.out.println(b[r]);
        }
    }
}