public class AreaofCirclebyInstance 
{
   double radius = 26;
   public static void main(String args[])
    {
      AreaofCirclebyInstance obj = new AreaofCirclebyInstance();
      double area  = 3.14*obj.radius*obj.radius; 
      System.out.println("Area of circle ==> "+area); 
    
   } 
}
