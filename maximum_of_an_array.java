import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        int a,sum=0,co=0,max;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
         b[i]=sc.nextInt();
        }
        max=b[0];
       for(int i=0;i<a;i++)
        {
          if(max<b[i])
           max=b[i];
        }
        
        System.out.print(max);
        
        
    }
}