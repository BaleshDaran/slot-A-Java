import java.util.Scanner;
public class Palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int r,sum=0,temp;
int n=sc.nextInt();

temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(sum==temp)
{
System.out.println("It is an palindrome");
}
else
{
System.out.println("Its not an palindrome");
}
}
}