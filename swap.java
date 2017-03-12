import java.util.*;
class SwapNumbers
{
public static void main(String args[])
{
int x, y, temp;
System.out.println("Enter x and y");
Scanner s = new Scanner(System.in);
x = s.nextInt();
y = s.nextInt();
System.out.println("Before Swapping");
System.out.println("the value of x :+x");
System.out.println("the value of y :+y");
temp = x;
x = y;
y = temp;
System.out.println("After Swapping");
System.out.println("the value of x :+x");
System.out.println("the value of y :+y");
   }
}