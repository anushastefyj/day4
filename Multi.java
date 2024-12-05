import java.util.*;
public class Multi
{
public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    int t=Sc.nextInt();   
for(int i=0;i<=t;i++)
{
    int b=Sc.nextInt();
    if((b&7)==0)
    {
    System.out.println("anu");
    }
else{
    System.out.println("stefy");
}
}
}
}