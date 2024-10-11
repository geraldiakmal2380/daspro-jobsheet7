import java.util.Scanner;
public class TugasParkiran10 {
    public static void main(String[] args) {
        int jenis,durasi = 0,total = 0;
        Scanner mlebu = new Scanner(System.in);
        do {
            

            System.out.println("1.Mobil ");
            System.out.println("2.Motor ");
            System.out.println("0.Metu");
            System.out.print("Masukan jenis kendaraan : ");
            jenis = mlebu.nextInt();
            System.out.print("Masukan Durasi Parkir : ");
            durasi = mlebu.nextInt();
            
            if (jenis == 1 || jenis == 2){
                if(durasi > 5 ){
                    total += 12500;
                }
                else{
                    if (jenis == 1){
                        total += durasi*3000;
                    }
                    else if(jenis == 2){
                        total += durasi*2000; 
                    }
                    else{
    
                    }
                }
            }
        }while(jenis != 0);
        System.out.println("Total biaya parkir anda adalah Rp"+total);
        mlebu.close();

        

    }
}
    
