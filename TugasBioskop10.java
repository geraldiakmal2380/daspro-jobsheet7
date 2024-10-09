import java.util.Scanner;
public class TugasBioskop10 {
    public static void main(String[] args) {
        double tiket=50000,diskon,totalbayar,valuediskon;
        int jumlahtiket=0;
        Scanner masuk = new Scanner(System.in);

        do{
            
            System.out.print("Masukan jumlah tiket yang ingin dibeli : ");
            jumlahtiket = masuk.nextInt();
            if (jumlahtiket>=0){
                if (jumlahtiket >4){
                    diskon = 0.1;
                    totalbayar = tiket*jumlahtiket;
                    valuediskon = diskon*totalbayar;
                    System.out.println("Jadi total pembelian tiket sebanyak "+jumlahtiket+" dan diskon sebesar "+diskon*100+"%");
                    System.out.println("Total bayar anda adalah Rp"+totalbayar+" dan diskon dengan nominal Rp"+valuediskon+" jadi anda membayar Rp"+(totalbayar-valuediskon));
                }
                else if(jumlahtiket>10){
                    diskon = 0.15;
                    totalbayar = tiket*jumlahtiket;
                    valuediskon = diskon*totalbayar;
                    System.out.println("Jadi total pembelian tiket sebanyak "+jumlahtiket+" dan diskon sebesar "+diskon*100+"%");
                    System.out.println("Total bayar anda adalah Rp"+totalbayar+" dan diskon dengan nominal Rp"+valuediskon+" jadi anda membayar Rp"+(totalbayar-valuediskon));
                }
                else{
                    diskon = 0;
                    totalbayar = tiket*jumlahtiket;
                    valuediskon = diskon*totalbayar;
                    System.out.println("Jadi total pembelian tiket sebanyak "+jumlahtiket+" dan diskon sebesar "+diskon*100+"%");
                    System.out.println("Total bayar anda adalah Rp"+totalbayar+" dan diskon dengan nominal Rp"+valuediskon+" jadi anda membayar Rp"+(totalbayar-valuediskon));
                }
            }
            else{
                System.out.println("jangan menginput tiket minus");
            }

        } while(true);
        
    }
}
