import java.util.*;
import java.io.*;
import java.math.*;
class pow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>=1)
        System.out.println("Not prime");
        else
        System.out.println("Prime");
        
    }
}
