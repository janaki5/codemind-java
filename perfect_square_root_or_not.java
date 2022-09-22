import java.util.Scanner;
class code
{ 
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n;
    float d, t;
    n=sc.nextInt();
    t=(float)Math.sqrt(n);
    d=t-(int)t;
    if(d==0)
    System.out.println("True");
    else
    System.out.println("False");
    
    
    }
}