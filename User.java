import java.util.Scanner;
class User
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an username:");
String str1=sc.nextLine();
System.out.println("Enetr an username:");
String str2=sc.nextLine();
if(str1.equals(str2))
{
System.out.println("Username is valid");
}
else
{
System.out.println("Username is INvalid");
}
}
}