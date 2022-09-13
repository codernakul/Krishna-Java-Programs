class fascinating
{
    /**
     * Enter any number below to check for Fascinating Number:-
       */
    void main(long num)
    {
        long i,n,c=0,nCopy,flag=0;
        n=num;
        i=num*2;
        while(i!=0)
        {
            ++c;
            i=i/10;
        }
        n=n*(long)Math.pow(10,c)+num*2;
        c=0;
        i=num*3;
        while(i!=0)
        {
            ++c;
            i=i/10;
        }
        n=n*(long)Math.pow(10,c)+num*3;  //the number to be checked has been formed 
        nCopy=n;
        for(i=1;i<=9;i++)
        {
            n=nCopy;
            c=0;
            while(n!=0) //checking if every number is present only once
            {
                if((n%10)==i)
                    ++c;
                n=n/10;    
            }
            if(c!=1) //checking if number is absent or is present multiple times
                ++flag;
        }
        if(flag==0)
            System.out.println(num+" is a Facinating Number");
        else
            System.out.println(num+" is not a Facinating Number");
    }
}
