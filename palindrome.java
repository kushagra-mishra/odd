import java.util.*;
import java.io.*;
import java.math.*;
class pale
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
        int d=n%10;
        sum=sum*10+d;
        n=n/10;
        }
        if(sum==temp)
        System.out.println("palindrome");
        else
        System.out.println("Not palindrome");
        
    }
}
