import java.io.*;
public class rw
{
    public static void main(String [] args)throws IOException
    {
        String word;
        BufferedReader br = new BufferedReader(new FileReader("dict.txt"));

        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
        while((word=br.readLine())!=null)
        {
            if(word.length()>3)
                out.println(word);
        }
    }
}