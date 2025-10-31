package ocp;

// Implementasi interface TipePembayaran untuk kartu kredit
public class Kredit implements TipePembayaran {
    private String namaBank;
    private String noKartu;
    private int cicilanBulan;

    public Kredit(String namaBank, String noKartu, int cicilanBulan) {
        this.namaBank = namaBank;
        this.noKartu = noKartu;
        this.cicilanBulan = cicilanBulan;
    }

    @Override
    public void prosesPembayaran(double total) {
        double perBulan = total / cicilanBulan;
        System.out.println("Metode Pembayaran: KREDIT");
        System.out.println("Bank: " + namaBank);
        System.out.println("Nomor Kartu: " + noKartu);
        System.out.println("Cicilan: " + cicilanBulan + " bulan");
        System.out.println("Total: Rp " + total);
        System.out.println("Pembayaran per bulan: Rp " + perBulan);
    }
}