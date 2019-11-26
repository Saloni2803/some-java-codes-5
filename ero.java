class ero
{
public static void main(String args[])
{
int a[]={2,3,4,5};
try
{
int l=args.length;
System.out.print(a[4]);
}
catch(ArithmeticException ae)
{
System.out.print(ae);
}
catch(Exception aa)
{
System.out.print(aa);
}
}
}