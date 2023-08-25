/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam=0;
        int armutkg,elmakg,domateskg,muzkg,patlicankg;

        Scanner manav = new Scanner(System.in);
        System.out.println("Armut Kac Kilo"+ armutkg);
        armut = manav.nextInt();
        System.out.println(" Elma Kac Kilo"+ elmakg);
        elma  = manav.nextInt();
        System.out.println("Domates Kac Kilo"+domateskg);
        domates  = manav.nextInt();
        System.out.println("muz Kac Kilo"+muzkg);
        muz  = manav.nextInt();
        System.out.println("Patlican Kac Kilo"+ patlicankg);
        patlican  = manav.nextInt();

toplam=(armut*armutkg)+(elma*elmakg)+(domateskg*domates)+(muz*muzkg)+(patlicankg*patlican);

System.out.println("Toplam Borc"+toplam);

    }
}*/

import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner manav = new Scanner(System.in);

        double armutFiyat = 2.14, elmaFiyat = 3.67,domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = manav.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = manav.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = manav.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = manav.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = manav.nextDouble();

        double toplamTutar = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat)
                + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam Tutar : " + toplamTutar) ;


    }
}
