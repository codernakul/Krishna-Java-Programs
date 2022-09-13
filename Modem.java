import java.util .*;
class Modem 
{
    void main()
    {
        int i,l,c=0;char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String a=sc.nextLine();
        String w="";
        a=a.toUpperCase();
        a=a.trim();
        a=a+" ";
        l=a.length();
        for(i=0;i<l;i++)
        {
            ch=a.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                for(int j=0;j<w.length()-1;j++)
                {
                    if(w.charAt(j+1)-w.charAt(j)==1)
                    {
                        System.out.println(w);
                        ++c;
                        break;
                    }
                }
                w="";
            }
        }
        System.out.println("No. of words consecutive letter "+c);
    }
}
                