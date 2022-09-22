import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,d=0,t,p=1;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            d=d+r;
            p=p*r;
            n=n/10;
        }
        if(d==p)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}