import java.util.*;
public class Middle
{
public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    int a=Sc.nextInt();
    int b=Sc.nextInt();
    int c=Sc.nextInt();
    if(a>b)
    {
        if(b>c)
        System.out.println(b);
        else if(a>c)
        System.out.println(c);
        else
        {
         System.out.println(a);
        }
    }
    else
{

    if(a>c)
    System.out.println(a);
    else if(b>c)
    System.out.println(c);
    else {
       System.out.println(b);
         }
}
    

}
}