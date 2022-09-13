class pattern
{
    public static void main(String [] args)
    {
        int i;
        int a[] ={2,6,12,20,30,42};
        for (i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        for ( int j=5 ;j>=0;j--)
        {
            for (i=0;i<j;i++)
            {
                a[i]=a[i+1]-a[i];
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
    