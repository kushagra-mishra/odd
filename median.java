import java.util.*;
import java.lang.Math;
class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
           sum=sum+ar[i];
        }
        System.out.println(sum/n);
         
    }
  
}
