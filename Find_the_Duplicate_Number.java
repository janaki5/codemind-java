import java.util.Scanner;
class Dup
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,j,x[],c=0;
      n=sc.nextInt();
      x=new int[n];
      for(i=0;i<n;i++)
      x[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
          for(j=i+1;j<n;j++)
          {
              if(x[i]==x[j])
              {
                  System.out.println(x[i]);
                  break;
              }
          }
          
          
      }
      
    }
}