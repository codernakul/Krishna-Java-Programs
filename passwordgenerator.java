import javax.swing.JOptionPane;
class passwordgenerator
{
    public static void main()
    {
        String size = JOptionPane.showInputDialog("How big of a password u want (8 or 16)");
        char a[] = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','h','k','l','z','x','c','v','b','n','m','1','2','3','4','5','6','7','8','9','?','!','@','#','$','^','&','*'};
        int l= a.length;
        String s="";
        if(size.equals("8"))
        {
            for (int i=0; i<8;i++)
            {
                int k=(int) (Math.random()*(l-0))+0;
                s=s+a[k];
            }
            JOptionPane.showMessageDialog( null, "Here is your Password:----- "+s);
            System.out.println("You can copy it from here:");
            System.out.println();
            System.out.println(s);
        }
        else if(size.equals("16"))
        {
            for (int i=0; i<16;i++)
            {
                int k=(int) (Math.random()*(l-0))+0;
                s=s+a[k];
            }
            JOptionPane.showMessageDialog( null, "Here is your Password:----- "+s);
            System.out.println("You can copy it from here:");
            System.out.println();
            System.out.println(s);
        }
        else
            JOptionPane.showMessageDialog( null, "Get Out!  Don't enter useless things here  ;(");

    }
}
