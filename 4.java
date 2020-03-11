import java.io.*;
import java.util.*;
class C
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,c=0;
n=s.nextInt();
while(n!=1)
{
if(n%2==0)
{
n=n/2;c++;
}
else
{
n=n-1;c++;
}
}
System.out.print(c);
}
}
