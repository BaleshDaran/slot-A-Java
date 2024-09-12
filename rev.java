import java.util.Scanner;
public class rev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String str;
char ch;
str=sc.nextLine();
System.out.println("Reverse of a "+str+"is:");
for(int j=str.length();j>0;--j)
{
System.out.print(str.charAt(j-1));
}
}
}
