import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,m,j,count=0,count1=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count=count+i;
        }
        for(j=1;j<=m;j++)
        {
            if(m%j==0)
            count1=count1+j;
        }
        if((count==count1) && (count1==count))

            System.out.print("Amicable");
        else
        System.out.println("Not Amicable");
    }
}