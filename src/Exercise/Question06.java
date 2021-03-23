package Exercise;

import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {
        //kullanıcı girişli yapalım:

        Scanner girdi = new Scanner(System.in);
        System.out.print("birinci sayı: ");
        int s1 = girdi.nextInt();
        System.out.print("ikinci sayı: ");
        int s2 = girdi.nextInt();
        if (s1 > s2) {
            System.out.println(s1 + " büyüktür " + s2);
        } else if (s1 < s2) {
            System.out.println(s1 + " küçüktür " + s2);
        } else {
            System.out.println(s1 + " eşittir " + s2);
        }

    }
}
