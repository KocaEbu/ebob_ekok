import java.util.Scanner;

public class ekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Sayiyi giriniz: ");
        int n1 = input.nextInt();

        System.out.print("Ikinci Sayiyi giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1, ekok =1;

        if (n1 < n2) {
            ebob = n1;
            while (ebob >= 1) {
                if (n1 % ebob == 0 && n2 % ebob == 0) {

                    System.out.println("EBOB : " + ebob);
                    ekok = (n1*n2)/ebob;
                    System.out.println("EKOK : "+ekok);
                    break;
                }
                ebob--;
            }


        } else if (n1 == n2) {
            System.out.println("Sayilar esittir EBOB : " + n1);
            ekok = (n1*n2)/ebob;
            System.out.println("EKOK : "+ekok);

        } else {
            // n2'nin küçük olduğu durumu çözümleyeceğimiz bölüm.
            ebob = n2;
            while (ebob >= 1) {
                if (n1 % ebob == 0 && n2 % ebob == 0) {

                    System.out.println("EBOB : " + ebob);
                    ekok = (n1*n2)/ebob;
                    System.out.println("EKOK : "+ekok);
                    break;
                }
                ebob--;

            }

        }


    }

}
