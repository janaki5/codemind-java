import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,count=0;
        n=sc.nextInt();
         x=new int[n];
         for(i=0;i<n;i++)
         {
            x[i]=sc.nextInt();
         }
         for(i=0;i<n-2;i++)
         {
             if(x[i]%2==0 && x[i+2]%2==0)
             {
                 if(x[i]%2==0)
                 {
                     count++;
                 }
             }
         }
         System.out.println(count);
    }
}