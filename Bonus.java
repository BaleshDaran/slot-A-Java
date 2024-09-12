import java.util.Scanner;
public class Bonus
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int  Bo,Total;
int Salary;
String Grade;
System.out.println("Enter the details of an employee:");

System.out.println("Enter a salary:");
Salary=sc.nextInt();

System.out.println("Enter a grade:");
Grade=sc.nextLine();

if(Salary<=10000)
{
	if(Grade.equals('A'))
	{
	Bo=(Salary)*(7/100);
      Total=Bo;
	System.out.println("Salary to be credited:"+Total);
	}
	else
	{
	if(Grade.equals('B'))
	Bo=(Salary)*(12/100);
      Total=Bo;

	System.out.println("Salary to be credited:"+Total);
	}
}
else
{
	if(Grade.equals('A'))
	{
	Bo=(Salary)*(5/100);
      Total=Bo;
	System.out.println("Salary to be credited:"+Total);
	}
	else
	{
	if(Grade.equals('B'))
	Bo=(Salary)*(10/100);
      Total=Bo;
  	

	System.out.println("Salary to be credited:"+Total);
	}
}
}
}

