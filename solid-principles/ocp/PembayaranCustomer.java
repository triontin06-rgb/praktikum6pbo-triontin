package ocp;

// Kelas utama yang menyimpan data customer dan menghubungkan ke interface TipePembayaran
public class PembayaranCustomer {
    private String namaCustomer;
    private double totalBelanja;
    private TipePembayaran tipePembayaran;

    public PembayaranCustomer(String namaCustomer, double totalBelanja) {
        this.namaCustomer = namaCustomer;
        this.totalBelanja = totalBelanja;
    }

    public void setTipePembayaran(TipePembayaran tipePembayaran) {
        this.tipePembayaran = tipePembayaran;
    }

    public void lakukanPembayaran() {
        System.out.println("\n===== Data Customer =====");
        System.out.println("Nama Customer: " + namaCustomer);
        tipePembayaran.prosesPembayaran(totalBelanja);
        System.out.println("=============================\n");
    }
}