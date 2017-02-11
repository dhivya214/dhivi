import java.util.Scanner;
class Oe
{
public static void main (String args[])
{

int a[],i;
Scanner s=new Scanner(System.in);

System.out.println("enter the size of an array");
a[]=s.nextInt();
System.out.println("enter the value of" +a[]);
for(i=0;i<10;i++)
{
if(i%2==0)
{

System.out.println("even" +a[i]);
}
else
{
System.out.println("odd" +a[i]);
}
}
}
}