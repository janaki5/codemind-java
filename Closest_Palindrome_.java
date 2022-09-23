import java.util.Scanner;
class Code
{
    public static boolean ispal(int n)
    {
        int r=0,d=0,temp;
        temp=n;
        while(n!=0)
        {
        r=n%10;
        d=d*10+r;
        n=n/10;
        }
        if(d==temp)
        return true;
        else
        return false;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n,i,a=0,b=0;
            n=sc.nextInt();
            for(i=n+1;;i++)
            {
                if(ispal(i))
                {
                 a=i;
                 break;
                }
            }
            for(i=n-1;;i--)
            {
                if(ispal(i))
                {
                 b=i;
                 break;
                }
            }
            if(n-b>a-n)
            System.out.println(a);
            else if(n-b<a-n)
            System.out.println(b);
            else
            System.out.println(b+" "+a);
        }
}