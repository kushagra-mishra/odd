import java.io.*;
import java.util.*;
class a
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        
        for(int i=0;i<k;i++)
       {
           sum=sum+ar[i];
          
       }
        System.out.println(sum);
    }
}
