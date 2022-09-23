import java.util.Scanner;
class Nearprime
{
    public static boolean isprime(int n)
    {
      int count=0;
      for(int i=2;i<=(int)Math.sqrt(n);i++)
      {
          if(n%i==0)
            count++;
      }
      if(count==0)
        return true;
      else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1=0,d2=0;
        n=sc.nextInt();
        
        
        
        
          if(isprime(n))
          {
             System.out.println("prime"); 
          }
          else
          System.out.println("not a prime");
        
    }
}