package day15_methodCreation;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        int sayi = 66;
        int sayac = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir ile 100 arasında bir sayı tuttum bakalım bulabilcen mi?");
        int tahmin = scan.nextInt();
        while (sayi != tahmin) {
            sayac+=1;
            if (tahmin < sayi) {
                System.out.println("çık çık");
            }
            else if (tahmin>sayi){
                System.out.println("in in");
            }

            Scanner scan2 =new Scanner(System.in);
            tahmin=scan2.nextInt();
            tahmin++;
        }
        System.out.println( (sayac*1) + ". tahmininde buldun");
    }
}