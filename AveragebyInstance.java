public class AveragebyInstance 
{
    int a = 7, b = 9, c = 14;
    public static void main(String args[])
     {
        AveragebyInstance obj = new AveragebyInstance();
        float Average = (obj.a+obj.b+obj.c)/3;
        System.out.println("Average of Listed Number ==> " +Average);        
    }
}
