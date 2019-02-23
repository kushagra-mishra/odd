import java.util.*;
import java.lang.Math;
class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int k=n;
            double sum=0;
            while(k!=0)
            {
                int d=k%10;
                sum=sum+Math.pow(d,3);
                k=k/10;
            }
            if(sum==n)
            System.out.println("yes");
            else
            System.out.println("no");
        }
}
