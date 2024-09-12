import java.util.Scanner;
public class Income
{
public static void main(String args[])
{
int Income,Tax;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an income: ");
Income = sc.nextInt();
if(Income<=150000)
{
System.out.println("No Tax");
}
else if(Income>=150001 && Income<=300000)
{
int Tax1=Income*10/100;
System.out.println("Tax =" + Tax1);
}
else if(Income>=300001 && Income<=500000)
{
int Tax2=Income*20/100;
System.out.println("Tax =" + Tax2);
}
else if(Income>=500001)
{
int  Tax3=Income*30/100;
System.out.println("Tax =" + Tax3);
}
else if(Income<0)
{
System.out.println("Invalid Income");
}
System.out.println();
}
}