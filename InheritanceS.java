import java.util.Scanner;
import java.I0.*;

class student {
    int id, eng, hin, math, comp, art, avg;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:   ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.println("Marks Of Five Subjects: ");
        System.out.print("English:    ");
        eng = sc.nextInt();
        System.out.print("Hindi:      ");
        hin = sc.nextInt();
        System.out.print("Maths:      ");
        math = sc.nextInt();
        System.out.print("Physic:     ");
        comp = sc.nextInt();
        System.out.print("Chemistry:  ");
        art = sc.nextInt();

    }
}

class InheritanceS extends student {
         void disp() {
         int avg = (eng + hin + math + comp + art) / 5;
         final int t = eng+hin+math+comp+art;
         System.out.println("\nRoll No:" + id + "\nName:" + name + "\nTotal Marks:" + t + "\nPercentage:" + avg +"%");
    }
    public static void main(String[] args) {
        InheritanceS s = new InheritanceS();
        s.input();
        s.disp();
    }
}
