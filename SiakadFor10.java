import java.util.Scanner;

public class SiakadFor10 {

    public static void main(String[] args) {
        double nilai,tertinggi = 0,terendah = 100,lulus=0,tidaklulus=0;
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
            if (nilai >=60){
                lulus += 1;
            }
            else{
                tidaklulus += 1;
            }
            }
            masuk.close();
            System.out.println("Nilai Tertinggi adalah "+tertinggi+" dan nilai terendah adalah "+terendah);
            System.out.println("Jumlah Mahasiswa yang lulus adalah "+((int)lulus)+" jumlah Mahasiswa yang tidak lulus adalah "+((int)tidaklulus));
    }
}