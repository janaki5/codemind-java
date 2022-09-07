import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,b,n,sq1,rem=0,sum=0;
        
        n=sc.nextInt();
        b=n*n;
        while(b>0)
        {
            rem=b%10;
            sum=sum+rem;
            b=b/10;
        }
        if(sum==n)
        {
         System.out.println("Neon Number");
        }
        else
        System.out.println("Not Neon Number");
    }
}