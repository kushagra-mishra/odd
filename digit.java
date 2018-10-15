import java.io.*;
import java.util.*;
class a
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int d;
        while(n>0)
        {
            d=n%10;
            n/=10;
            c++;
        }
        System.out.println(c);
    }
}
