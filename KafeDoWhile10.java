import java.util.Scanner;

public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti,totalharga;
        String namapelanggan;
        int hargakopi = 12000,hargateh = 7000,hargaroti = 20000;
        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namapelanggan = sc.next();
            if (namapelanggan.equalsIgnoreCase("batal")){
                System.out.println("transaksi dibatalkan");
                sc.close();
                break;
            }
            System.out.print("Jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh : ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti : ");
            roti = sc.nextInt();
            totalharga = ((hargakopi*kopi)+(hargaroti*roti)+(hargateh*teh));
            System.out.println("Total yang harus dibayar : Rp "+totalharga);

        }while (true);
        System.out.println("semua transaksi selesai");
    }
}
