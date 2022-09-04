import java.util.Scanner;
class Primeex
{
  public static boolean isprime(int n)
  {
   int count=0;
   for(int i=2;i<=(int)Math.sqrt(n);i++)
   {
    if(n%i==0)
     {
      count++;
     }
   }
   if(count==0)
     return true;
   else
     return false;
   }
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n,n2,i,count=0,sum=0;
   n=sc.nextInt();
   n2=sc.nextInt();
   sum=n+n2;
   for(i=sum+1;;i++)
   {
       count++;
       if (isprime(i))
       {
       break;
       }
   }
   System.out.println(count);
  }
}