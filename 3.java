import java.io.*;
import java.util.*;
class B
{
public static void main(String args[])
{
int [] input=new int[30];
int output;
Scanner s=new Scanner(System.in);
int n,i,j,max=0;
n=s.nextInt();
for(i=0;i<n;i++)
input[i]=s.nextInt();
for(i=0,i<n;i++)
{
for(j=i;j<n;j++)
if((input[i]^input[j])>max)
max=input[i]^input[j];
}
System.out.print(max);
}
}




