import package_graphics.*;
import java.util.Scanner;
public class Q1
 {
public static void main(String []args)
{
 System.out.println("\nName:Ameekha unussaleem");
System.out.println("Reg No:SJC22MCA-2004");
System.out.println("Course_Name:OOPS Lab");
System.out.println("Course_Code:22MCA132");
System.out.println("Date:22-06-23");
System.out.println("\n.........................\n");
package_graphics testObj = new package_graphics();
int l,h,r,a,c,d;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length for rectangle");
l=s.nextInt();
System.out.println("Enter the breadth for rectangle");
h=s.nextInt();
System.out.println("Enter the radius of circle");
r=s.nextInt();
System.out.println("Enter the side for Square");
a=s.nextInt();
System.out.println("Enter the breadth for triangle");
c=s.nextInt();
System.out.println("Enter the height for triangle");
d=s.nextInt();
System.out.println("Area of rectangle="+testObj.recArea(l,h));
System.out.println("Area of circle="+testObj.cirArea(r));
System.out.println("Area of square="+testObj.squArea(a));
System.out.println("Area of triangle="+testObj.triArea(c,d));
}
}
