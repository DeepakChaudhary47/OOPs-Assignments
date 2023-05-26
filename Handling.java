class Handling
{
    public static void main(String[]args) {

        try
        {   int a=10,b=0,c;
             c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Can't divide by Zero");
        }
        try
        {
            int a[]={10,28,40,79,90,48};
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Beyond The Array limit");
        }
    }
}