import java.util.Scanner;

public class percobaan1 {

    public static void main(String[] args) {
        double nilai,tertinggi = 0,terendah = 100;
        Scanner masuk = new Scanner(System.in);
        
        for (int i =1;i <= 10;i++){
            System.out.print("masukan Nilai ke-"+i+" :");
            nilai = masuk.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }

            }
            masuk.close();
            System.out.println("Nilai Tertinggi adalah "+tertinggi+" dan nilai terendah adalah "+terendah);
    }
}