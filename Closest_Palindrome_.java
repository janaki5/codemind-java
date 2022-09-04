import java.util.Scanner;
class NearestPrime
{
  public static boolean isPal(int n)
  {
      int temp=n,sum=0,r;
      while(n>0)
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
	 int n,i,d1,d2;
         n=sc.nextInt();
         
	 for(i=n-1;;i--)
	 {
	     if(isPal(i))
		 {
		   d1=i;
                   break;
		 }
	 } 
	for(i=n+1;;i++)
	 {
	     if(isPal(i))
		 {
		   d2=i;
                   break;
		 }
	 } 
        
        if((n-d1)==(d2-n))
            System.out.println(d1+" "+d2);
        else if((n-d1)<(d2-n))
            System.out.println(d1);
        else
            System.out.println(d2);
        
  }
  
}

