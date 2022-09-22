import java.util.Scanner;
class Coswe
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,r=0,d=0;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            d=d*10+r;
            n=n/10;
        }
        System.out.println(d);
    }
}