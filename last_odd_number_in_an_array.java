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
       for(int i=0;i<a;i++)
        {
            if(b[i]%2!=0)
            {
                c=b[i];
            }
        }
        System.out.println(c);
    }
}