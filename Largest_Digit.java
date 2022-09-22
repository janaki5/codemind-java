import java.util.Scanner;
class code
{ 
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,max=0,r=0;
    n=sc.nextInt();
    while(n!=0)
    {
        r=n%10;
        if(max<r)
        {
        max=r;
        }
        n=n/10;
    }
    
    
    System.out.println(max);
    
    
    }
}