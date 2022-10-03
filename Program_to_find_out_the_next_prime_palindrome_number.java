import java.util.Scanner;
class PrimesInRange
{
  public static boolean isPrime(int n)
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
  public static boolean isPal(int n)
  {
      int r=0,sum=0,temp=0;
      temp=n;
      while(n!=0)
      {
       r=n%10;
       sum=sum*10+r;
       n=n/10;
      }
      if(sum==temp)
         return true;
       else
          return false;
  }
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n,c=0;
	 n=sc.nextInt();
	 for(int i=n+1;;i++)
	 {
	     if(isPrime(i)&&isPal(i))
		 {
				c=i;
				break;
		   
		 }
	 }
	  System.out.println(c);
  }
  
}
