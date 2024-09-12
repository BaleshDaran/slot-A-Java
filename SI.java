import java.util.Scanner;
class SI
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the principle amount:");
float p=sc.nextFloat();
System.out.println("enter the number of years:");
float t=sc.nextFloat();
System.out.println("whether the customer is a senior citizen :");
char ch=sc.next().charAt(0);
if(ch=='y')
{
System.out.println("yes");
float r = 12;
float si = (p*r*t)/100;
System.out.println("Simple interest"+si);
}
else
{
System.out.println("No");
float r = 10;
float si = (p*r*t)/100;
System.out.println("Simple interest"+si);
}
}
}