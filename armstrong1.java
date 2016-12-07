import java.io.*;
import java.util.*;
class armstrong1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,sum=0,s=0,count=0,count1=0;
System.out.println("Enter intervals:");
n1=sc.nextInt();
n2=sc.nextInt();
int a[]=new int[n2];
int b[]=new int[n2];
int c[]=new int[n2];
for(int i=n1;i<n2;i++)
{
a[i]=i%10;
b[i]=i%100;
b[i]=(b[i]-a[i])/10;
c[i]=i/100;
sum=(a[i]*a[i]*a[i])+(b[i]*b[i]*b[i])+(c[i]*c[i]*c[i]);
if(sum==i)
{
s=sum;
count++;
}
else
count1++; 
}
if(count==0)
{
System.out.println("No armstrong numbers between given intervals");
}
else
{
System.out.println("Armstrong number:"+s);
}
}
}
