import java.io.*;
import java.util.*;
class A
{
public static void main(String a[])
{
  int [] input=new int[100];
int [][] queries=new int[20][20];
int [] expoutput={2,7,14,8};
int []output=new int[10];
int n,i,q,j,k,sum;
Scanner s=new Scanner(System.in);
n=s.nextInt();q=s.nextInt();
for(i=0;i<n;i++)
input[i]=s.nextInt();
for(i=0;i<q;i++)
for(j=0;j<2;j++)
queries[i][j]=s.nextInt();
for(i=0;i<q;i++)
{
sum=0;
for(j=0;j<1;j++)
{
for(k=queries[i][j];k<=queries[i][j+1];k++)
sum=sum^input[k];
}
output[i]=sum;
}
for(i=0;i<q;i++)
System.out.print(output[i]+ " ");
}
}

