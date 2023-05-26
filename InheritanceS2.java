import java.util.Scanner;
class Intrest{
    int p,r,t,i;
    void inputt(){
    final Scanner d=new Scanner(System.in);
    System.out.print("Enter Principal Amount:  ");
    p=d.nextInt();
    System.out.print("Enter Rate:   ");
    r=d.nextInt();
    System.out.print("Enter Time:   ");
    t=d.nextInt();
    }
}
 class InheritanceS2 extends Intrest{
         void dispp(){
            i = (p*r*t)/100;
            System.out.println("Simple intrest is: "+i);
}
    public static void main(String[] args) {
        InheritanceS2 m=new InheritanceS2();
         m.inputt(); m.dispp();

}
}
