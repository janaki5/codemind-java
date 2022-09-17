import java.util.Scanner;
class Code
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
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   int x[],i,n,b=0,z;
   
   n=sc.nextInt();
   
   x=new int[n];
   
   for(i=0;i<n;i++)
   {
     x[i]=sc.nextInt();
   }
   z=sc.nextInt();
   for(i=0;i<n;i++)
   {
      if(isprime(x[i]))
      {
          if(x[i]>=z)
          b++;
      }
   }
   

System.out.print(b);
}
}

