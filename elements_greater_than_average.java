import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        int a,sum=0,c=0,co=0;
        float avg=0;
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
        c=sum/a;
        
        for(int j=0;j<a;j++)
        {
            if(b[j]>=c)
            {
                co++;
            }
        }
        System.out.print(co+" ");
    }
}