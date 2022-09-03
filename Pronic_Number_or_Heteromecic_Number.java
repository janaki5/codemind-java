import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n,p=0;
     n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
         if(i*(i+1)==n)
         {
          p=1;
          break;
         }
     }
        if(p==1)
          System.out.println("YES");
         else
          System.out.println("NO");
         
     }
    }
