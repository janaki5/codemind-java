import java.util.Scanner;
class Factorcount
{
 public static void main (String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n, count=0;
  n=sc.nextInt();
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
      count=count+i;
  }
  if(count>n)
  System.out.println("True");
  else
  System.out.println("False");
 }
}