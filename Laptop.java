package septiya;

public class Laptop extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("OS Laptop : Hidupkan OS");
    }

    @Override
    void matikan_os() {
        System.out.println("OS Laptop : Matikan OS");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse Laptop : Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mouse Laptop : Klik Kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Keyboard Laptop : Tekan Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Printer Laptop : Cetak Data");
    }
    
}