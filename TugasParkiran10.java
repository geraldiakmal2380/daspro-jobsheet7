import java.util.Scanner;
public class TugasParkiran10 {
    public static void main(String[] args) {
    
        int pilihanuser,durasiparkir;
        double hargamobil= 3000,hargamotor = 2000,total=0;
        do{
            Scanner mlebu = new Scanner(System.in);
            System.out.println("Masukan jenis kendaraan");
            System.out.println("1.Mobil");
            System.out.println("2.Motor");
            System.out.println("3.Keluar");
            System.out.print("Masukan pilihan : ");
            pilihanuser = mlebu.nextInt();
            if (pilihanuser== 1 || pilihanuser==2 || pilihanuser==0){
                if (pilihanuser == 1){
                    System.out.print("masukan durasi parkir anda : ");
                    durasiparkir = mlebu.nextInt();
                    if (durasiparkir>5){
                        total += 12500;
                    }
                    else{
                        if (pilihanuser == 1){
                            if(total == 0 ){
                                total += hargamobil;
                            }
                            else{
                            total += durasiparkir*3000;
                            }
                        }
                        else if(pilihanuser == 2){
                            if (total == 0){
                                total += hargamotor;
                            }
                            total += durasiparkir*2000;
                        }
                    }
                }
            } 
            else{
                System.out.println("yang bener aja");
            }
        }while(true);

    }
}
