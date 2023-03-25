public class SimpleIntrestbyInstance
{
    float principal = 9,rate = 2, time = 8;
    public static void main(String args[])
    {
        SimpleIntrestbyInstance obj = new SimpleIntrestbyInstance();
        float u = (obj.principal*obj.rate*obj.time)/100;
        System.out.println("Simple Intrest is ==> " +u);
    }
}