package hashset;

public class Main {
    public static void main(String[] args) {
       //substring - keepstring
       String a = "Hello World";

       //substring(startIndex, endIndex+1);
       System.out.println(a.substring(6,11));

       //carry
       int b = 8, c = 7;
       System.out.println("Result =" + (b+c)%10);
       System.out.println("Carry= " + (b+c)/10);
       
    }
}
