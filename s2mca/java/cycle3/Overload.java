class OverloadDemo
{
void area(float x)
{
System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
}
void area(float x, float y)
{
System.out.println("the area of the rectangle is "+x*y+" sq units");
}
void area(double x)
{
double z = 3.14 * x * x;
System.out.println("the area of the circle is "+z+" sq units");
}
}
class Overload 
{
public static void main(String args[]) 
{
System.out.println("\nName:Ameekha unussaleem");
System.out.println("Reg No:SJC22MCA-2004");
System.out.println("Course_Name:OOPS Lab");
System.out.println("Course_Code:22MCA132");
System.out.println("Date:07-06-23");
System.out.println("\n.........................\n");
OverloadDemo ob = new OverloadDemo();
ob.area(5);
ob.area(11,12);
ob.area(2.5);
}
}
