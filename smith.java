class smith 
{

    public static void main(int n)
    {
        int r=0,s=0,c=0,k=0,ss=0;
        int num=n,fac=n;
        int a[]= new int [100];
  
            while(num!=0)
            {
                r=num%10;
                s+=r;
                num=num/10;
            }
        
        for(int i=2;i<=fac;i++)
        {
            if (fac%i==0)
            {
                int copy=i;
                for (int j=1;j<=i;j++)
                {
                  if(i%j==0)
                  c++;
                }
                if (c==2)
                {
                a[k++]=copy;
                fac/=copy;
                i=1;
            }
             c=0;   
            }
        }
        for (int b=0;b<k;b++)
        {
            if (a[b]>9)
            {
                while(a[b]!=0)
                {
                    int t=a[b]%10;
                    ss=ss+t;
                    a[b]/=10;
                }
            }
            else
            ss+=a[b];
        }
        if (ss==s)
        System.out.println(n+" is a smith number");
        else
        System.out.println(n+" is not a smith number");
    }
}
                