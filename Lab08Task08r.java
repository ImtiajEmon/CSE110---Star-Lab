import java.util.Scanner;
public class Lab08Task08r
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int num1=sc.nextInt();
    for(int i=1;i<=num1;i++)
    {
      for(int p=0;p<=num1-i;p++)
        System.out.print(" ");
      for(int j=1;j<=i;j++)
        System.out.print(j);
      System.out.print("\n");
    }
  }
}