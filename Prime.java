import java.io.*;
import java.util.*;

public class Prime
{
    static boolean isPrime(int x)
    {
        if(x<0 || x==0 || x==1)
            return false;
        for(int i=2;i<(x/2);i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n))
          System.out.println("yes");
        else
            System.out.println("no");
    }
}