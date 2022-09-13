class fraction
{
    public static void main(double m)
    { 
        String n=""+m;
        double k=m-Math.floor(m);
        double t=0.0;
        int c=0;
        for (int i=n.length()-1;i>=0;i--)
            {
                char ch=n.charAt(i);
                if(ch!='.')
                {
                  c++;
                }
                else 
                {
                    int r =(int)k%10;
                    t+=r*Math.pow(2,-c--);
                    k=k/10;
                }
            }  
            System.out.print((int)t);
    }
}