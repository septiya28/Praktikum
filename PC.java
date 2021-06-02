package septiya;

public class PC extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("OS PC : Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("OS PC : Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse PC : Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mouse PC : Klik Kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Keyboard PC : Tekan Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Printer PC : Cetak Data");
    }
    
}
