import java.util.Scanner;
public class Marks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a marks:");
int python=sc.nextInt();
System.out.println("enter a marks:");
int cprogram=sc.nextInt();
System.out.println("Enter a marks:");
int maths=sc.nextInt();
System.out.println("Enter a marks:");
int Physics=sc.nextInt();

int Aggregate;
Aggregate=(python+cprogram+maths+Physics)/4;
System.out.println("Aggregate ="+Aggregate);
}
}
  