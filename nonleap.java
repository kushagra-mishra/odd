import java.io.*;
import java.util.*;
class a
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if((s%4==0)||(s%100!=0) &&(s%400==0))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
