package Exercise;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println(" 0<x<=10 arasında bir sayı giriniz: ");
        int sayı = girdi.nextInt();
        if (sayı > 0 && sayı <= 5) {
            int sayı2;
            sayı2 = sayı + sayı;
            System.out.println(sayı2);
        }else if (sayı > 5 && sayı <= 10) ;{
            int sayı3;
            sayı3 = sayı * 2;
            System.out.println(sayı3);
        }
}
}