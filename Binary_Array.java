import java.util.Scanner;
class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],c=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0 || arr[i]==1)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
        
    }
}