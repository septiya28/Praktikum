package septiya;

public class Netbook extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("OS Netbook : Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("OS Netbook : Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse Netbook : Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mouse Netbook : Klik Kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Keyboard Netbook : Tekan Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Printer Netbook : Cetak Data");
    }
    
}