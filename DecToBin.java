import java.util.*;
class DecToBin
{
public static void main(String args[])
{
int dnum,bnum=0,i,t;
Scanner s = new Scanner(System.in);
System.out.println("Enter a decimal number");
dnum = s.nextInt();
t = dnum;
while(t>0)
{
i = t%2;
bnum = bnum*10+i;
t /= 2;
}
System.out.println("Binary Equivalent is "+bnum);
}
}

