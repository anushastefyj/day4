import java.util.*;
public class Find
{
public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    int t=Sc.nextInt();   
for(int i=0;i<t;i++)
{
    int n=Sc.nextInt();
for(int j=0;j<n;j++) 
   {
    if((n&j)==0)
    {
    System.out.println(j);
    }
else{
    System.out.println();
}
}
}
}    
}