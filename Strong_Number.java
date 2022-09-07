import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,rem=0,sum=0;
        
        n=sc.nextInt();
        int m=n;
        while(n>0)
        {   
            int fact=1;
            rem=n%10;
            for(i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==m)
        {
         System.out.println("The number "+m+" is a strong number");
        }
        else
        System.out.println("The number "+m+" is not a strong number");
    }
}