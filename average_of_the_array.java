import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        int a,sum=0,co=0;
        float c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
         b[i]=sc.nextInt();
        }
    
       for(int i=0;i<a;i++)
        {
          sum=sum+b[i];
        }
        c=(float)sum/a;
        System.out.format("%.2f",+c);
        
        
    }
}