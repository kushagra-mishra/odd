import java.io.*;
import java.util.*;
class a
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        char c=(char) System.in.read();
        if(c>=97 && c<122 || c>=65 && c<90 )
        {
            System.out.println("Alphabet");
        }
        else
        System.out.println("No");
    }
}
