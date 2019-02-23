import java.util.*;
import java.lang.Math;
class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        float a=sc.nextInt();
        float d=sc.nextInt();
        int k=2*a+n-1*d;
        float sum=(n/2)*k;
        System.out.println(k);
    }
}
