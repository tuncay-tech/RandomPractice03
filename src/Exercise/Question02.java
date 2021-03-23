package Exercise;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayı = scanner.nextInt();
        if (sayı > 0) {
            int sayı2 = sayı * 3;
            System.out.print(">>>" + sayı2);
        } else if (sayı < 0) {
            int sayı3 = sayı * 2;
            System.out.print(">>>" + sayı3);
        } else {
            System.out.println("girdiğiniz sayı 0 dır başka bir sayı giriniz");
        }
    }
}
