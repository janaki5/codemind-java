import java.util.Scanner;
class Gcf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,gcd=0,min=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            min=b;
        else
            min=a;
        for(i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
                
            }
        }
        System.out.println(gcd);
        sc.close();
    }
}