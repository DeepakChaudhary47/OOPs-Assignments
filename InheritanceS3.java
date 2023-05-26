 import java.util.Scanner;
 class Intrest{
    int p,r,t,i;
     
 }
 class intrest1 extends Intrest{
           void inputt(){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Principal Amount: ");
           p=sc.nextInt();
           System.out.println("Enter Rate: ");
           r=sc.nextInt();
           System.out.println("Enter Time: ");
           t=sc.nextInt();
    }
 
 class InheritanceS3 extends intrest1
 {
    void dispp(){
        i = (p*r*t)/100;
        System.out.println("Simple intrest is: "+i);
}
    public static void main(String[] args) {
    final InheritanceS3 f=new InheritanceS3();
        f.inputt(); f.dispp();
}
}