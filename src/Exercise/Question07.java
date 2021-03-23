package Exercise;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        //100 lük sistemde girilen notu 5 lik sisteme çevirme:
        double not;
        Scanner girdi = new Scanner(System.in);
        System.out.print("notu giriniz: ");
        not = girdi.nextDouble();
        if (not < 0) {
            System.out.println("hatalı not girdiniz");
        }
        else if (not>0 && not<30) {
            System.out.println("zayıf : 1");
        } else if (not>=30 && not<45) {
            System.out.println("geçer : 2");
        } else if (not>=45 && not<65) {
            System.out.println("orta : 3");
        } else if (not >= 65 && not<75) {
            System.out.println("iyi : 4");
        } else if (not>= 75 && not <=100) {
            System.out.println("pekiyi : 5");
        } else {
            System.out.println("100 den büyük not yazmayınız");
        }

    }
}
