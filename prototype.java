import javax.swing.JOptionPane;
public class prototype
{
    public static void main()
    {
        String size = JOptionPane.showInputDialog("How big of a password u want");
        char a[] = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','h','k','l','z','x','c','v','b','n','m','1','2','3','4','5','6','7','8','9','?','!','@','#','$','^','&','*'};
        int l= a.length;
        String s="";
         int m = Integer.parseInt(size);
         if (m>0)
         {
            for (int i=0; i<m;i++)
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
            System.out.println("well, u cant have a password in negative or zero");
            
    }
}
