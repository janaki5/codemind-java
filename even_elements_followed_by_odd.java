import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(int j=0;j<n;j++)
        {
            if(a[j]%2!=0)
            {
                System.out.print(a[j]+" ");
            }
        }
    }
}