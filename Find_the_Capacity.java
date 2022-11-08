import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        int c=2*s*t*b*512;
        int kb=c/1024;
        System.out.println(kb+"KB");
        
    }
}