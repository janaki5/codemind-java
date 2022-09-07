import java.util.Scanner;
class Cos
{
    public static void main(String args[])
    {
        int m,n,r1=0,r2=0,re1=0,re2=0,s1,s2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s1=n*n;
        m=n;
        while(n>0)
        {
            r1=n%10;
            re1=re1*10+r1;
            n=n/10;
        }
        s2=re1*re1;
        while(s2>0)
        {
            r2=s2%10;
            re2=re2*10+r2;
            s2=s2/10;
        }
        if(s1==re2)
        {
            System.out.println("True");
        }
        else 
           System.out.println("False");
    }
}