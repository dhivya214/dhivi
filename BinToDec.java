import java.util.*;
class BinToDec
{
public static void main(String args[])
{
int bnum,dnum=0,i,t,c=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a binary number");
bnum = s.nextInt();
i = bnum;
while(i>0)
{
t = i%10;
dnum = dnum+((int)Math.pow(2,c)*t);
i = i/10;
c++;
}
System.out.println("Decimal Equivalent is "+dnum);
}
}