import java.io.*;
import java.util.*;
class a
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int sum=0;
        for(int i=1;i<=n;i++)
       {
           sum=sum+i;
          
       }
        System.out.println(sum);
    }
}
