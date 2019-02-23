import java.util.*;
import java.lang.Math;
class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]>max)
            max=ar[i];
        }
          System.out.println(max);
    }
  
}
