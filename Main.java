import java.util.*;
import java.net.*;

//Clipboard
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

//to fetch image
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.Image.*;
import java.awt.image.BufferedImage;

//to find - https://yt3.ggpht.com/

class Main
{
    static String content = null;
    public static void main(String []args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String w;
        while(true)
        {
            w="https://i5.nhentai.net/galleries/1339123/"+i+".jpg";
            System.out.println(w);

            URL url = new URL(w);
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
            {
                out.write(buf, 0, n);
            }

            out.close();
            in.close();
            byte[] response = out.toByteArray();

            FileOutputStream fos = new FileOutputStream("C://Users//Nakul//Java//NEW//NH-Scraper//Images//"+i+".jpg");
            fos.write(response);
            fos.close();
        }
    }
}