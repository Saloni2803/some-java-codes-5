import java.util.*;
import java.lang.Math;
class decimal
{
public static void main(String[] args)
{
int x,a=0,count=0,sum=0;
Scanner s=new Scanner(System.in);
x=s.nextInt();
int y=x;
while(x!=0)
{
a=x%10;
count++;
sum+=(a*Math.pow(2,count-1));
x=x/10;
}
System.out.print(sum);
}
}
