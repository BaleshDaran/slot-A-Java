import java.util.Scanner;
public class Cube
{
public static void main(String args[])
{
try
{
Scanner s=new Scanner(System.in);
System.out.println("enter an number:");
double n=s.nextDouble();
double a=0,b=0;
a=n*n;
b=n*n*n;
System.out.println("the square of numbers="+a);
System.out.println("the cube of number="+b);
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}