import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;



        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Sayı Giriniz: ");
            n= inp.nextInt();
            if (n  %2  ==0 || n % 2 == 0 ){
                toplam += n;


            }


        }while (n % 2 == 0 || n % 4 == 0);
        System.out.print("Girilen Çift ve 4'ün katları olan sayıların toplamı: ");
        System.out.println(toplam);

    }
}