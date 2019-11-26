import java.util.*;
class dua
{
public static void main(String[] args)
{
int i,j;
int arr[][]=new int[2][3];
Scanner sc=new Scanner(System.in);
for(i=0;i<2;i++)
for(j=0;j<3;j++)
arr[i][j]=sc.nextInt();
for(i=0;i<2;i++)
for(j=0;j<3;j++)
System.out.print(arr[i][j]);
}
}
