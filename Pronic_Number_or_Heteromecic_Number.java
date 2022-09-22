import java.util.Scanner;
class Coswe
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
            count=1;
                
            }
            
        }
        if(count==1)
  System.out.println("YES");
  else
            System.out.println("NO");
    }
}