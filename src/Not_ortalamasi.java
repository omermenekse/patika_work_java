import java.util.Scanner;

public class Not_ortalamasi {

    public static void main(String[] args) {
        System.out.println("***********************\n" +
                "Ders notları ortalaması\n" +
                "***********************\n");

        Scanner scan = new Scanner(System.in);

        double notOrtlama = 0;
        System.out.println("Lütfen matematik ders notunuzu giriniz");
        int mat = scan.nextInt();
        System.out.println("Lütfen fizik ders notunuzu giriniz");
        int fiz = scan.nextInt();
        System.out.println("Lütfen kimya ders notunuzu giriniz");
        int kim = scan.nextInt();
        System.out.println("Lütfen edebiyat ders notunuzu giriniz");
        int ede = scan.nextInt();
        System.out.println("Lütfen coğrafya ders notunuzu giriniz");
        int cog = scan.nextInt();

        notOrtlama = mat + fiz + kim + ede + cog / 5;
        System.out.println(notOrtlama);


    }
}