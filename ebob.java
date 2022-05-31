import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Sayiyi giriniz: ");
        int n1 = input.nextInt();

        System.out.print("Ikinci Sayiyi giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;

        if (n1 < n2) {
            ebob = n1;
            while (ebob >= 1) {
                if (n1 % ebob == 0 && n2 % ebob == 0) {

                    System.out.println("EBOB : " + ebob);
                    break;
                }
                ebob--;
            }


        } else if (n1 == n2) {
            System.out.println("Sayilar esittir EBOB : " + n1);

        } else {
            // n2'nin küçük olduğu durumu çözümleyeceğimiz bölüm.
            ebob = n2;
            while (ebob >= 1) {
                if (n1 % ebob == 0 && n2 % ebob == 0) {

                    System.out.println("EBOB : " + ebob);
                    break;
                }
                ebob--;

            }

        }


    }

}
