import java.util.Scanner;
public class Eligible
{
public static void main(String args[])
{
int age,sh;
System.out.println("Enter your age:");
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
if(age>=18)
{
System.out.println("You can eligible for vote");
}
else
{
sh=18-age; 
System.out.println("You can vote after " +sh+ " Years");
}
}
}
