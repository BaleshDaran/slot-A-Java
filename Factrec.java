import java.util.Scanner;
public class Factrec
{
public static void main(String args[])
{
try
{
Scanner s=new Scanner(System.in);
System.out.println("Enter an number");
int n=s.nextInt();
System.out.println("the factorial of "+n+"is=");
System.out.print(rec(n));
}
catch(Exception e)
{
System.out.println("invalid");
}
}
public static int rec(int x)
{
if(x>0)
{
return x*rec(x-1);
}
else return 1;
}
}