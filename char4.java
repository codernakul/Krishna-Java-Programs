import java.util.*;
class char4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char ch[] = new char[20];
        int v=0,c=0;
        System.out.println("Enter the letters");
        for (int i=0 ; i<20;i++)
        ch[i] = sc.next().charAt(0);
        
        for (int j=0; j<ch.length ; j++)
        {
            ch[j]=Character.toUpperCase(ch[j]);
            if(ch[j]=='A' || ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U')
            ++v;
            else
            ++c;
        }
        System.out.println("Number of vowels in the set :"+ v);
        System.out.println("Number of consonants in the set:"+ c);
    }
}
    
    