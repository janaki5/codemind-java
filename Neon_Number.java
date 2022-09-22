import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,d=0,temp,t;
        n=sc.nextInt();
        t=n*n;
        temp=n;
        while(t!=0)
        {
            r=t%10;
            d=d+r;
            t=t/10;
        }
        if(d==temp)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}