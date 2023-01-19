import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // n üssü 3 = n.n.n
        int sayi1, sayi2, total=1, i=1;
        Scanner imp = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        sayi1 = imp.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = imp.nextInt();
        /*
        while(i <= sayi2){
            total*=sayi1;
            i++;
        }
        System.out.println(sayi1);

         */

        for(;i<=sayi2; i++){
           total *=sayi1;
        }
        System.out.println(total);
    }
}