import java.util.*;
public class Count
{
public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    int t=Sc.nextInt();
    for(int j=0;j<t;j++)
    {
         int n=Sc.nextInt();
         int c=0;
      for(int i=0;i<t;i++)   
      {
        if(n%1==0){
            c+=1;
        }
      }
      System.out.println(c);
        }
      }
    }