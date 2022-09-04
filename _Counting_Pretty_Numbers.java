import java.util.Scanner;
class Jaava
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0)
        {
        int a,b,d,i,count=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
        
        
            d=i%10;
            if(d==2 || d==3 || d==9)
             count++;
            
        
        }
        System.out.println(count);
        t--;
        
        }
          
    }
}