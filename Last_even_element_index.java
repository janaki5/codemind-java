import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        int a,c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
         b[i]=sc.nextInt();
        }
       for(int j=0;j<a;j++)
        {
            if(b[j]%2==0)
            {
                c=j;
            }
        }
        System.out.println(c);
    }
}