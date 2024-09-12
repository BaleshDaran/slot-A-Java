import java.util.Scanner;
public class Vowels
{
public static void main(String [] args)
{
int count=0;
System.out.println("Enter a Statement:");
Scanner sc=new Scanner(System.in);
String stat = sc.nextLine();
for(int i=0;i<stat.length();i++)
{
char ch=stat.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
count++;
}
}
System.out.println("no.of.Vowels"+count);
}
}
