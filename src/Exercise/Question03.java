package Exercise;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayı = girdi.nextInt();

        if (sayı > 90) {
            System.out.println("sayı 90 dan büyüktür");
        } else if (sayı >= 80) {
            System.out.println("sayı 90 ile 80 arasındadır");
        } else if (sayı >= 70) {
            System.out.println("sayı 70 ile 80 arasındadır");
        } else if (sayı >= 60) {
            System.out.println("sayı 60 ile 70 arasındadır");
        } else if (sayı >= 50) {
            System.out.println("sayı 50 ile 60 arasındadır");
        } else if (sayı >= 40) {
            System.out.println("sayı 40 ile 50 arasındadır");
        } else if (sayı >= 30) {
            System.out.println("sayı 30 ile 40 arasındadır");
        } else if (sayı >= 20) {
            System.out.println("sayı 20 ile 30 arasındadır");
        }else if (sayı>=10){
            System.out.println("sayı 10 ile 20 arasındadır");
        }else if (sayı>=0){
            System.out.println("sayı 0 ile 10 arasındadır");
        }else {
            System.out.println("negatif bir sayı grdiniz yeniden poizitf bir sayı deneyiniz");
        }
    }
}