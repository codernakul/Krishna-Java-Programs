class twinprime
{
            static boolean isPrime(int n)
            {
                int c=0;
                for (int i=1;i<=n;i++)
                {
                    if(n%i==0)
                    c++;
                }
                if(c==2)
                return true;
               else
                return false;
            }
             public static void main()
            {
                for (int j=1;j<=10000;j++)
                {
                    for (int k=1;k<=10000;k++)
                    {
                        if (isPrime(j)==true && isPrime(k)==true && ( k-j==2) )
                        System.out.println(j +" and "+(k)+" are twinprime");
                        
                    }
                }
            }
        }

                
    