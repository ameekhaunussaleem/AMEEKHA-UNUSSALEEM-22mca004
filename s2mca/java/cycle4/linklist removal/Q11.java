import java.util.*;

public class Q11 {
    public static  void main(String[] args){
System.out.println("\nName:Ameekha unussaleem");
System.out.println("Reg No:SJC22MCA-2004");
System.out.println("Course_Name:OOPS Lab");
System.out.println("Course_Code:22MCA132");
System.out.println("Date:23-06-23");
System.out.println("\n.........................\n");
        LinkedList<String> L=new LinkedList<>();
        L.add("Gold");
        L.add("Silver");
        L.add("Bronze");
        L.add(0,"Olympics Medals");
        System.out.println(L);
        L.remove("Bronze");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);


    }

}

