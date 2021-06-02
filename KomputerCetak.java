package septiya;

public class KomputerCetak {
    final void cetak(Komputer[] obj){
        for (Komputer obj1 : obj) {
            obj1.hidupkan_os();
            obj1.matikan_os();
            obj1.klik_kanan();
            obj1.klik_kiri();
            obj1.tekan_enter();
            obj1.cetak_data();
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Komputer[] obj = { new PC(),
                        new Laptop(),
                        new Netbook()};
        
        KomputerCetak hasil = new KomputerCetak();
        hasil.cetak(obj);
    }
    
}
