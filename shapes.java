import java.util.Scanner;
public class shapes
{
void area(int r1)
{
double Area_val = 3.14*r1*r1;
System.out.println("\n Area of circle is="+Area_val);
}
void area(int a1,int b1)
{
int Area_val=a1*b1;
System.out.println("\n Area of rectangle is with dimensions "+a1+"X"+b1+"="+Area_val);
}
void area(int a1,int b1,int c1)
{
int Area_val=a1*b1*c1;
System.out.println("\n Area of cuboid is with dimensions"+a1+"X"+b1+"X"+c1+"="+Area_val);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the length");
int l=sc.nextInt();
System.out.println("\n enter the breadth");
int b=sc.nextInt();
System.out.println("\n enter the height");
int h=sc.nextInt();
System.out.println("\n enter the radius");
int r1=sc.nextInt();
shapes obj1=new shapes();
obj1.area(r1);
obj1.area(l,b);
obj1.area(l,b,h);
}
}
