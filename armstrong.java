import java.util.*;
import java.lang.Math;
class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            int k=i;
            double sum=0;
            while(k!=0)
            {
                int d=k%10;
                sum=sum+Math.pow(d,3);
                k=k/10;
            }
            if(sum==i)
            System.out.println(i);
        }
    }
}
