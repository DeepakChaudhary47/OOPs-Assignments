public class Swap {
  public static void main(String args[]){
     int a = 5;
     int b = 6;
     System.out.println("Element before swap");
     System.out.println("a: "+a +" b:"+ " "+ b);
     a = a + b;
     b = a - b;
     a = a - b;
     System.out.print("Element after Swap: ");
     System.out.println("a: "+a+ " b:"+ " "+ b);
   }
}
