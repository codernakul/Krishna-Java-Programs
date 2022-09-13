class pattern2
{
    public static void main(String s)
    {
        int l = s.length();
        for(int i=0 ; i<l ;i++)
        {
            System.out.print(s.substring(i,l));
            System.out.println(s.substring(0,i));
        }
    }
}
        