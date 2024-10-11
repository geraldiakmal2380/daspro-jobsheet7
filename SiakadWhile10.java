import java.util.Scanner;


public class SiakadWhile10 {


    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        int jmlhmhsiswa,n=1;
        double nilai;
        System.out.print("masukan jjumlah mahasiswa : ");
        jmlhmhsiswa = masuk.nextInt();


        while (n < jmlhmhsiswa){
            System.out.print(n);
            System.out.print("Masukan nilai mahasiswa ke-"+(n+1)+" :");
            nilai = masuk.nextDouble();
            if (nilai>=0 && nilai<=100){
                if (nilai>80 && nilai<=100){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah A");
                }
                else if (nilai>80 && nilai<=100){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah B+");
                }
                else if (nilai>73 && nilai<=80){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah B");
                }
                else if (nilai>65 && nilai<=73){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah C+");
                }
                else if (nilai>60 && nilai<=65){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah C");
                }
                else if (nilai>50 && nilai<=60){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah D");
                }
                else if (nilai>39 && nilai<=50){
                    System.out.println("Nilai Mahasiswa ke-"+(n+1)+" adalah E");
                }
            }
            else{
                System.out.println("Nilai tidak valid.Masukan lagi nilai yang valid!");
            }
            n++;

        }
        masuk.close();
        
    }
}
