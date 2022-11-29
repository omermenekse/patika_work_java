import java.util.Scanner;

public class KDV_tutari {


    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen aldığınız ürünün fiyatını giriniz");
            double fiyat= scan.nextDouble();

            if (fiyat>0&& fiyat<1000)
            {
                System.out.println("KDV'siz fiyat "+ fiyat +"\n"+
                        "KDV'li Fiyat "+ (fiyat*1.18)+ "\n"  +
                        "KDV tutarı  "+ (fiyat*0.18));
            }else {
                System.out.println("KDV'siz fiyat "+ fiyat +"\n"+
                        "KDV'li Fiyat "+ (fiyat*1.08)+ "\n"  +
                        "KDV tutarı  "+ (fiyat*0.08));
            }
        }

    }
