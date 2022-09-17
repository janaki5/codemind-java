import java.util.Scanner;

  class Array
{
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   int x[],i,n,a,co=0;
   n=sc.nextInt();
   a=sc.nextInt();
   x=new int[n];
   for(i=0;i<n;i++)
   {
     x[i]=sc.nextInt();
   }
for(i=0;i<n;i++)
{
 if(x[i]%a==0)
 co++;
}
System.out.println(co);
}
}

