import java.util.Scanner;
class Year
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year:");
int y=sc.nextInt();
System.out.println("Enter a month:");
int m=sc.nextInt();
System.out.println("Enter a date:");
int d=sc.nextInt();
if((y%4==0)&&(y%100!=0)||(y%400==0))
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a Leap year");
}
}
}

