class dispatch
{
public static void main(String[] args)
{
A a=new A();
A b=new B();
A c=new C();
a.display();
b.display();
c.display();
}
}
class A
{
void display()
{
System.out.print("class a");
}
}
class B extends A
{
void display()
{
System.out.print("class b");

}}
class C extends A
{
void display()
{
System.out.print("class c");
}
}