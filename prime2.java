import java.util.*;
import java.lang.Math;
class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();        
           for(int i=n1+1;i<n2;i++)
           {   
               int c=0;
               int k=i;
               for(int j=2;j<k;j++)
               {
                   if(k%j==0)
                   c++;
               }
                if(c==0)
           System.out.println(k);
           }
          
    }
}
