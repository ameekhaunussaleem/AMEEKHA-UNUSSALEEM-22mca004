import java.util.Scanner;
class Fib extends Thread{
int f,n1=0,n2=1,n3;
Fib(int c){
this.f=c;
}
public void run(){
System.out.println("fib is "+n1);
System.out.println("fib is "+n2);
for(int i=2;i<this.f;++i) {
n3=n1+n2;
System.out.println("fib is "+n3);
n1=n2;
n2=n3;
}
}
}
class even extends Thread{
int range;
even(int range){
this.range=range;
}
public void run(){
for(int i=0;i<this.range;i++){
if(i%2==0){
System.out.println("even num is "+i);
}
}
}
}
public class Q6 {
public static void main(String [] args){
   System.out.println("\nName:Ameekha unussaleem");
System.out.println("Reg No:SJC22MCA-2004");
System.out.println("Course_Name:OOPS Lab");
System.out.println("Course_Code:22MCA132");
System.out.println("Date:23-06-23");
System.out.println("\n.........................\n");
int c,range;
Scanner sc=new Scanner(System.in);
System.out.println("enter the count of Fibinooci");
c=sc.nextInt();
Fib fi=new Fib(c);
System.out.println("enter the range of even number");
range=sc.nextInt();
even ev = new even(range);
fi.start();
ev.start();
}
}
