import java.util.Scanner;
class code
{ 
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int t;
    t=sc.nextInt();
    while(t!=0)
    {
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println(sum);
        t--;
    }
    }
}