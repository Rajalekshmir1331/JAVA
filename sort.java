import java.util.Scanner;
import java.util.Arrays;
public class sort
{
public static void main(String[]args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of words");
int num=sc.nextInt();
String word[]=new String[num];
sc.nextLine();
for(i=0;i<num;i++)
{
System.out.println("\n enter a word\n");
word[i]=sc.nextLine();
}
for(i=0;i<num;i++)
{
for(j=i+1;j<num;j++)
{
if(word[i].compareTo(word[j])
>0)
{
String temp=word[i];
word[i]=word[j];
word[j]=temp;
}
}
}
System.out.println("sorted strings using compareTofunction="+Arrays.toString(word));
System.out.println(word);
}
}
