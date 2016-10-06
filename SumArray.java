import java.io.*;
import java.util.*;
public class SumArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] a=new int[100];
System.out.println("enter the array size:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("enter a["+i+"]= ");
a[i]=sc.nextInt();
}
int sum=0;
for(int j=0;j<n;j++)
{
sum+=a[j];
}
System.out.println("sum of array element is"+sum);
}
}
