import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nedan ett program som anger det största talet först, sedan det mindre sen");

        Scanner Jamfortalstorstaforst = new Scanner(System.in);
        System.out.print("Ange tal 1: "); int Tal1 = Jamfortalstorstaforst.nextInt();
        System.out.print("Ange tal 2: "); int Tal2 = Jamfortalstorstaforst.nextInt();

        if (Tal1 > Tal2) {
            System.out.println(Tal1 + " " + Tal2) ;
        }
        else {
            System.out.println(Tal2 + " " + Tal1) ;
        }

    }
}
